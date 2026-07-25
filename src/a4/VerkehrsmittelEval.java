package a4;

public class VerkehrsmittelEval {
  private static boolean fahrpreisCheck(Verkehrsmittel v, int km, int erw) {
    try {
      int erg = v.fahrpreis(km);
      if (erg != erw) {
        System.out.println("FEHLER: v.fahrpreis(" + km + ") -> " + erg 
                           + " statt " + erw);
        return false;
      }
      return true;
    } catch (Exception e) {
      System.out.println("FEHLER: v.fahrpreis(" + km + ") -> " + e);
      return false;
    }
  }
  private static boolean luftdruckCheck(HatLuftdruck hl, int erw) {
    try {
      int erg = hl.luftdruck();
      if (erg != erw) {
        System.out.println("FEHLER: hl.luftdruck() -> " + erg 
                           + " statt " + erw);
        return false;
      }
      return true;
    } catch (Exception e) {
      System.out.println("FEHLER: hl.luftdruck() -> " + e);
      return false;
    }
  }
  private static int count(boolean b) {
    return b ? 1 : 0;
  }
  private static int eval() {
    return (int)Math.round((0
                            + count(fahrpreisCheck(new Auto(5, 40), 120, 4800))
                            + count(fahrpreisCheck(new Auto(2, 25), 0, 0))
                            + count(fahrpreisCheck(new Bahn(true), 120, 2600))
                            + count(fahrpreisCheck(new Bahn(false), 50, 1200))
                            + count(fahrpreisCheck(new Bahn(false), 5, 300))
                            + count(fahrpreisCheck(new Bahn(false), 4, 240))
                            + count(fahrpreisCheck(new Bahn(true), 0, 240))
                            + count(fahrpreisCheck(new Fahrrad(28), 10, 0))
                            + count(fahrpreisCheck(new Fahrrad(35), 0, 0))
                            + count(luftdruckCheck(new Auto(5, 50), 22))
                            + count(luftdruckCheck(new Fahrrad(28), 28))
                            + count(luftdruckCheck(new Fahrrad(35), 35))
                            ) / (double) 12 * 8);
  }
  public static void main(String[] args) {
    System.out.println(eval() + 16);
  }
}
