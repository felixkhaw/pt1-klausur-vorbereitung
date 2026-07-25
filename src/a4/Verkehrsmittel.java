package a4;

public abstract class Verkehrsmittel { 
    private final int sitzpl;
    
    public Verkehrsmittel(int sitzpl) {
        this.sitzpl = sitzpl;
    }
    public abstract int fahrpreis(int dis);
}
