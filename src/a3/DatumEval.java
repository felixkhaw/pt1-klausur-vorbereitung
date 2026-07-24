package a3;

public class DatumEval {
  private static boolean parseCheck(String s, int j, int m, int t) {
    try {
      Datum erw = new Datum(j, m, t);
      Datum erg = Datum.parse(s);
      if (!erg.equals(erw)) {
        System.out.println("FEHLER: Datum.parse(" + '\"' + s + '\"' + ") -> " + erg 
                           + " statt " + erw);
        return false;
      }
      return true;
    } catch (Exception e) {
      System.out.println("FEHLER: Datum.parse(" + '\"' + s + '\"' + ") -> " + e);
      return false;
    }
  }
  private static boolean parseExCheck(String s) {
    try {
      Datum.parse(s); // IllegalArgumentException erwartet
    } catch (IllegalArgumentException e) {
      return true;
    } catch (Exception e) {
      System.out.println("FEHLER: Datum.parse(" + '\"' + s + '\"' + ") -> " + e);
      return false;
    }
    System.out.println("FEHLER: Datum.parse(" + '\"' + s + '\"' + ") -> keine Exception");
    return false;
  }
  private static int count(boolean b) {
    return b ? 1 : 0;
  }
  private static int eval() {
    return (int)Math.round((0
                            + count(parseCheck("1999/12/31", 1999, 12, 31))
                            + count(parseCheck("31.12.1999", 1999, 12, 31))
                            + count(parseCheck("0011/12/12", 11, 12, 12))
                            + count(parseCheck("12.12.0011", 11, 12, 12))
                            + count(parseCheck("2026/07/07", 2026, 7, 7))
                            + count(parseCheck("07.07.2026", 2026, 7, 7))
                            + count(parseCheck("2024/02/29", 2024, 2, 29))
                            + count(parseCheck("29.02.2024", 2024, 2, 29))
                            + count(parseExCheck("987/10/24"))
                            + count(parseExCheck("24.10.987"))
                            + count(parseExCheck("987/10/24"))
                            + count(parseExCheck("24.10.987"))
                            + count(parseExCheck(" 987/10/24"))
                            + count(parseExCheck("24.10. 987"))
                            + count(parseExCheck("1843/6/9"))
                            + count(parseExCheck("9.6.1843"))
                            + count(parseExCheck("1948/12/010"))
                            + count(parseExCheck("10.12.01948"))
                            + count(parseExCheck("1900/02/29"))
                            + count(parseExCheck("29.02.1900"))
                            ) / (double) 20 * 32);
  }
  public static void main(String[] args) {
    System.out.println(eval() + 4);
  }
}
