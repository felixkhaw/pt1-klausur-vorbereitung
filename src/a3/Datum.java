package a3;

public class Datum extends DatumBase {
    
    Datum(int j, int m, int t) {
        super(j, m, t);
    }
    
    public static Datum parse(String s){
        if(s.length() != 10) throw new IllegalArgumentException();
        int j = 0;
        int m = 0;
        int t = 0;
        
        char trennz = ' ';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '/' || s.charAt(i) == '.'){
                trennz = s.charAt(i);
            }
        }
        
        if (trennz == '/') {
            j = Integer.parseInt(s.substring(0, 4));
            m = Integer.parseInt(s.substring(5, 7));
            t = Integer.parseInt(s.substring(8, 10));
        } else if (trennz == '.') {
            t = Integer.parseInt(s.substring(0, 2));
            m = Integer.parseInt(s.substring(3, 5));
            j = Integer.parseInt(s.substring(6, 10));
        } else {
            throw new NumberFormatException();
        }
        return new Datum(j, m, t);
    }
}
