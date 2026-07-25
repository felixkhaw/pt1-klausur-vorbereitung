package a4;

public class Fahrrad extends Verkehrsmittel implements HatLuftdruck {
    
    private int luftd;
    
    public Fahrrad(int luftd){
        super(1);
        this.luftd = luftd;
    }
    
    @Override
    public int fahrpreis(int dis) {
        return 0;
    }
    
    public int luftdruck(){
        return luftd;
    }
}
