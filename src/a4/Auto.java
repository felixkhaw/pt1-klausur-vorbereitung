package a4;

public class Auto extends Verkehrsmittel implements  HatLuftdruck {
    
    private final int fahrtk;
    
    public Auto(int sitzpl, int fahrtk){
        super(sitzpl);
        this.fahrtk = fahrtk;
    }

    @Override
    public int fahrpreis(int dis) {
        return dis * this.fahrtk;
    }
    
    public int luftdruck(){
        return 22;
    }
}
