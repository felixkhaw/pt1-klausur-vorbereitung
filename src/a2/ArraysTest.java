package a2;

public class ArraysTest {
  private static boolean equals(int[][] a,
                                int[][] b) {
    if (a.length != b.length) {
      return false;
    }
    for (int i = 0; i < a.length; ++i) {
      if (a[i].length != b[i].length) {
        return false;
      }
      for (int j = 0; j < a[i].length; ++j) {
        if (a[i][j] != b[i][j]) {
          return false;
        }
      }
    }
    return true;
  }
  private static String toString(int[][] a) {
    String s = "[";
    if (a.length > 0) {
      s += java.util.Arrays.toString(a[0]);
      for (int i = 1; i < a.length; ++i) {
        s += ",\n" + java.util.Arrays.toString(a[i]);
      }
    }
    return s + "]";
  }
  private static boolean ausschnittCheck(int[][] a,
                                         int zVon, int zBis, int sVon, int sBis,
                                         int[][] erw) {
    int[][] erg = Arrays.ausschnitt(a, zVon, zBis, sVon, sBis);
    if (!equals(erg, erw)) {
      System.out.println("FEHLER: Arrays.ausschnitt(\n" + toString(a) + ",\n"
                         + zVon + "," + zBis + "," + sVon + "," + sBis + ")\n->\n" + toString(erg)
                         + "\nstatt\n" + toString(erw));
      return false;
    }
    return true;
  }
  private static boolean test() {
    return (  ausschnittCheck(new int[][]{{7, 1, -3, 0, -6},
                                          {4, -5, 9, -1, 2},
                                          {-3, 8, 3, 6, -4}}, 0, 2, 2, 5,
                              new int[][]{{-3, 0, -6},
                                          {9, -1, 2}})
          /*& ausschnittCheck(...)*/);
  }
  public static void main(String[] args) {
    if (test()) {
      System.out.println("OK");
    }
  }
}
