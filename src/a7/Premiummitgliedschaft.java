package a7;

public class Premiummitgliedschaft extends Mitgliedschaft {
    private boolean _mitPersonalTrainer;
    
    Premiummitgliedschaft(String name, int startdatum, boolean mitPersonalTrainer) {
        super(name, startdatum);
        this._mitPersonalTrainer = mitPersonalTrainer;
    }

    @Override
    public double monatsbeitrag() {
        double basis = _mitPersonalTrainer ? 39.99 : 29.99;
        return (Mitgliedschaft.AKTUELLES_JAHR - getStartjahr() >= 5) ? basis * 0.9 : basis;
    }

}
