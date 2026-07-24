package a2;

public class Arrays {
    
    public static int[][] ausschnitt(int[][] m, int zv, int zb, int sv, int sb){
        int anz_z = zb - zv;
        int anz_s = sb - sv;
        int[][] result = new int[anz_z][anz_s];
        
        for(int a = zv; a < zb; a++){
            for(int i = sv; i < sb; i++){
                result[a-zv][i-sv] = m[a][i];
            }
        }
        
        return result;
    }
    
    public static void toString(int[][] m){
        for(int a = 0; a < m.length; a++){
            for(int i = 0; i < m[a].length; i++){
                System.out.print(m[a][i] + " ");
            }
            System.out.println();
        }
    }
}
