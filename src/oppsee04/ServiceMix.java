package oppsee04;

public class ServiceMix
{
    /**
     * Gibt den n-ten Nachfolger von buchstabe zurück.
     *
     * Beispiel: buchstabe='a', n=3 -> Ergebnis: 'd'
     *
     * @param buchstabe Der char mit dem begonnen wird
     * @param n         Anzahl der Positionen die gesprungen werden sollen
     *
     * @return n-ter Nachfolger ausgehend von buchstabe
     */
    public char gibNtenNachfolger(char buchstabe, int n)
    {
        char nachf = ' ';
        char[] alphabet = {
                'A','B','C','D','E','F','G','H','I','J','K','L','M',
                'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                '[','\\',']','^','_','`',
                'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z',
                '{','|','}','~'
        };
        for(int i = 0; i < alphabet.length; i++){
            if(buchstabe == alphabet[i]){
                if(i+n > 61){
                    nachf = alphabet[(i+n)-61];
                } else {
                    nachf = alphabet[i+n];
                }
            }
        }
        return nachf;
    }
}
