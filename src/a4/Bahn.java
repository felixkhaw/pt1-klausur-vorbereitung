package a4;

public class Bahn extends Verkehrsmittel {

    public Bahn(boolean istreg){
        super(istreg ? 300 : 600);
    }

    @Override
    public int fahrpreis(int dis) {
        return dis < 5 ? 240 : 200+(dis*20);
    }
    
}
