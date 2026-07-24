package a1;

public class MatheEval {
  private static boolean medianCheck(int a, int b, int c, int erw) {
    int erg = Mathe.median(a, b, c);
    if (erg != erw) {
      System.out.println("FEHLER: Mathe.median(" + a + "," + b + "," + c + ") -> " + erg
                         + " statt " + erw);
      return false;
    }
    return true;
  }
  private static int count(boolean b) {
    return b ? 1 : 0;
  }
  private static int eval() {
    return (int)Math.round((0
                            + count(medianCheck(6, -1, 9, 6))
                            + count(medianCheck(9, 3, 0, 3))
                            + count(medianCheck(2, 8, 5, 5))
                            + count(medianCheck(-2, -19, -8, -8))
                            + count(medianCheck(3, 3, 3, 3))
                            + count(medianCheck(7, 7, 2, 7))
                            + count(medianCheck(-5, 4, -5, -5))
                            + count(medianCheck(2, 7, 7, 7))
                            ) / (double) 8 * 12);
  }
  public static void main(String[] args) {
    System.out.println(eval() + 2);
  }
}
