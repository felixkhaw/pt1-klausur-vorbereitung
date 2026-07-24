package a3;

public class Datum extends DatumBase {
    
    Datum(int j, int m, int t) {
        super(j, m, t);
    }
    
    public static Datum parse(String s){

        int j = 0;
        int m = 0;
        int t = 0;
        
        char trennz = ' ';
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '/' || s.charAt(i) == '.'){
                trennz = s.charAt(i);
            }
        }
        
        if(trennz == '/'){
            j = Integer.parseInt(s.substring(0 , 4));
            m = Integer.parseInt(s.substring(5, 7));
            t = Integer.parseInt(s.substring(8, 10));
        } else if(trennz == '.'){
            t = Integer.parseInt(s.substring(0,3));
            m = Integer.parseInt(s.substring(4, 6));
            j = Integer.parseInt(s.substring(7, 10)); 
        }
        return new Datum(j, m, t);
    }
}
