package a1;

import java.util.Arrays;

public class Mathe {
    public void main(String[] args) {
        System.out.println(median(2, 1,5));
    }
    
    public static int median(int a, int b, int c) {
        int[] result = new int[3];
        
        result[0] = a;
        result[1] = b;
        result[2] = c;
        
        Arrays.sort(result);
        
        return result[1];
    }
}
