package a3;

public class DatumBase {
  private int j;
  private int m;
  private int t;
  private static boolean istSchaltjahr(int j) {
    return (j % 4 == 0) & (j < 1583 ^ (j % 100 != 0 | j % 400 == 0));
  }
  private static int tageInMonat(int j, int m) {
    if (j < 1) {
      throw new IllegalArgumentException();
    }
    switch (m) {
      case 2:
        return istSchaltjahr(j) ? 29 : 28;
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        return 31;
      default:
        throw new IllegalArgumentException();        
    }
  }
  public DatumBase(int j, int m, int t) {
    if (t < 1 || t > tageInMonat(j, m)) {
      throw new IllegalArgumentException();
    }
    this.j = j;
    this.m = m;
    this.t = t;
  }
  public boolean equals(Object o) {
    if (!(o instanceof DatumBase)) {
      return false;
    }
    DatumBase d = (DatumBase)o;
    return j == d.j & m == d.m & t == d.t;
  }
  public String toString() {
    return (String.format("%4d", j) + "/" +
            (m < 10 ? "0" : "") + m + '/' +
            (t < 10 ? "0" : "") + t);
  }
}
