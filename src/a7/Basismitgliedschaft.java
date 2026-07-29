package a7;

public class Basismitgliedschaft extends Mitgliedschaft {
    
    Basismitgliedschaft(String name, int startdatum){
        super(name, startdatum);
    }

    @Override
    public double monatsbeitrag() {
        return 19.99;
    }

}
