package a2;

public class ArraysEval {
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
  private static int count(boolean b) {
    return b ? 1 : 0;
  }
  private static int eval() {
    return (int)Math.round((0
                            + count(ausschnittCheck(new int[][]{{1, 2, 3, 4},
                                                                {5, 6, 7, 8}}, 0, 2, 0, 4,
                                                    new int[][]{{1, 2, 3, 4},
                                                                {5, 6, 7, 8}}))
                            + count(ausschnittCheck(new int[][]{{1, 2, 3, 4}}, 0, 1, 0, 4,
                                                    new int[][]{{1, 2, 3, 4}}))
                            + count(ausschnittCheck(new int[][]{{1},
                                                                {2},
                                                                {3},
                                                                {4}}, 0, 4, 0, 1,
                                                    new int[][]{{1},
                                                                {2},
                                                                {3},
                                                                {4}}))
                            + count(ausschnittCheck(new int[][]{{1}}, 0, 1, 0, 1,
                                                    new int[][]{{1}}))
                            + count(ausschnittCheck(new int[][]{{ 11,  12,  13,  14,  15,  16},
                                                                {-21, -22, -23, -24, -25, -26},
                                                                { 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46},
                                                                { 51,  52,  53,  54,  55,  56}},
                                                                0, 3, 0, 2,
                                                    new int[][]{{ 11,  12},
                                                                {-21, -22},
                                                                { 31,  32}}))
                            + count(ausschnittCheck(new int[][]{{ 11,  12,  13,  14,  15,  16},
                                                                {-21, -22, -23, -24, -25, -26},
                                                                { 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46},
                                                                { 51,  52,  53,  54,  55,  56}},
                                                                3, 5, 2, 6,
                                                    new int[][]{{-43, -44, -45, -46},
                                                                { 53,  54,  55,  56}}))
                            + count(ausschnittCheck(new int[][]{{ 11,  12,  13,  14,  15,  16},
                                                                {-21, -22, -23, -24, -25, -26},
                                                                { 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46},
                                                                { 51,  52,  53,  54,  55,  56}},
                                                                0, 5, 1, 4,
                                                    new int[][]{{ 12,  13,  14},
                                                                {-22, -23, -24},
                                                                { 32,  33,  34},
                                                                {-42, -43, -44},
                                                                { 52,  53,  54}}))
                            + count(ausschnittCheck(new int[][]{{ 11,  12,  13,  14,  15,  16},
                                                                {-21, -22, -23, -24, -25, -26},
                                                                { 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46},
                                                                { 51,  52,  53,  54,  55,  56}},
                                                                2, 4, 0, 6,
                                                    new int[][]{{ 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46}}))
                            + count(ausschnittCheck(new int[][]{{ 11,  12,  13,  14,  15,  16},
                                                                {-21, -22, -23, -24, -25, -26},
                                                                { 31,  32,  33,  34,  35,  36},
                                                                {-41, -42, -43, -44, -45, -46},
                                                                { 51,  52,  53,  54,  55,  56}},
                                                                1, 4, 2, 5,
                                                    new int[][]{{-23, -24, -25},
                                                                { 33,  34,  35},
                                                                {-43, -44, -45}}))
                            ) / (double) 9 * 18);
  }
  public static void main(String[] args) {
    System.out.println(eval() + 2);
  }
}
