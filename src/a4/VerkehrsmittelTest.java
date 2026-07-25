package a4;

public class VerkehrsmittelTest {
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
  private static boolean test() {
    return (  fahrpreisCheck(new Fahrrad(28), 10, 0)
         /* & fahrpreisCheck(...) */
            & luftdruckCheck(new Fahrrad(28), 28)
         /* & luftdruckCheck(...) */);
  }
  public static void main(String[] args) {
    if (test()) {
      System.out.println("OK");
    }
  }
}
