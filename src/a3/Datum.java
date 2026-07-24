package a3;

public class Datum extends DatumBase {
    
    Datum(int j, int m, int t) {
        super(j, m, t);
    }
    
    public static Datum parse(String s){
        int[][] pos1 = {
                {0,1,2,3},
                {5,6},
                {8,9}
        };

        int[][] pos2 = {
                {0,1},
                {3,4},
                {6,7,8,9}
        };

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
            j = Integer.parseInt(s.substring(pos1[0][0], pos1[0][pos1[0].length - 1]));
            m = Integer.parseInt(s.substring(pos1[1][0], pos1[1][pos1[1].length - 1]));
            t = Integer.parseInt(s.substring(pos1[2][0], pos1[2][pos1[2].length - 1]));
        } else if(trennz == '.'){
            t = Integer.parseInt(s.substring(pos2[0][0], pos2[0][pos2[0].length - 1]));
            m = Integer.parseInt(s.substring(pos2[1][0], pos2[1][pos2[1].length - 1]));
            j = Integer.parseInt(s.substring(pos2[2][0], pos2[2][pos2[2].length - 1])); 
        }
        return new Datum(j, m, t);
    }
}
