package a6;

public class RekCharInString {
    /**
     * Zählt rekursiv, wie oft das Zeichen c im String s vorkommt, und
     * gibt die Position (Index, beginnend bei 0) des mittleren Vorkommens
     * von c in s zurück.
     *
     * "Mittleres Vorkommen" bedeutet: Kommt c insgesamt n-mal vor, so ist
     * damit das Vorkommen mit der Nummer (n / 2) gemeint (0-indexiert,
     * ganzzahlige Division), also z.B.
     *   - bei 3 Vorkommen: das 2. Vorkommen (Index 1 unter den Treffern)
     *   - bei 4 Vorkommen: das 3. Vorkommen (Index 2 unter den Treffern)
     *
     * Kommt c nicht in s vor, wird -1 zurückgegeben.
     *
     * Es dürfen keine Methoden aus der Java-API verwendet werden
     * (kein indexOf, kein lastIndexOf, etc.), nur charAt und length.
     * Die Methode muss rekursiv (nicht iterativ mit Schleifen) implementiert werden.
     *
     * Beispiel:
     *   s = "banana", c = 'a'
     *   Vorkommen von 'a' an den Positionen: 1, 3, 5 (also 3-mal)
     *   mittleres Vorkommen (Index 3/2 = 1) -> Position 3
     *   mittlerePosition("banana", 'a') liefert also 3
     *
     * @param s der zu durchsuchende String
     * @param c das zu zählende/suchende Zeichen
     * @return Position des mittleren Vorkommens von c in s, oder -1 falls c nicht enthalten ist
     */
    static void main(String[] args) {
        System.out.println(RekCharInString.mittlerePosition("Hallo Welt", 'l'));
    }

    public static int mittlerePosition(String s, char c) {
        int gesamt = zaehle(s, c, 0);
        return suche(s, c, 0, 0, gesamt / 2);
    }

    private static int zaehle(String s, char c, int index) {
        if(index == s.length()){
            return 0;
        }
        return zaehle(s,c, index + 1) + (s.charAt(index) == c ? 1 : 0);
    }

    private static int suche(String s, char c, int index, int gefunden, int ziel) {
        if(index == s.length()) return -1;
        if (s.charAt(index) == c && gefunden == ziel) return index;
        return suche(s,c,index + 1, (s.charAt(index) == c ? gefunden + 1 : gefunden), ziel);
    }
    
    
}
