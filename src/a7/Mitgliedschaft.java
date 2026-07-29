package a7;

public abstract class Mitgliedschaft {
    
    public static final int AKTUELLES_JAHR = 2026;
    private final String _name;
    private final int _startjahr;
    
    Mitgliedschaft(String name, int startjahr) {
        if(startjahr < 0 ) throw new IllegalArgumentException("startjahr darf nicht negativ sein");
        this._name = name;
        this._startjahr = startjahr;
    }
    
    public String getName() {
        return _name;
    }
    public int getStartjahr() {
        return _startjahr;
    }

    public abstract double monatsbeitrag();
    
    public double jahresbeitrag(){
        return monatsbeitrag() * 12;
    }
}
