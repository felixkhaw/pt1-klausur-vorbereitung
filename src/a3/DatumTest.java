package a3;

public class DatumTest {
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
  private static boolean test() {
    return (  parseCheck("2026/07/17", 2026, 7, 17)
         /* & parseCheck(...) */
            & parseExCheck("0/13/32")
         /* & parseExCheck(...) */);
  }
  public static void main(String[] args) {
    if (test()) {
      System.out.println("OK");
    }
  }
}
