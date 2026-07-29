package a5;

import java.util.Arrays;

public class ArraySort {
    
    public static void main(String[] args) {
        int[] arr = new int[]{7, -3, 5, 0, 2, -1};
        ArraySort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    // 7 -3 5 0 2 -1
    public static void sort(int[] arr){
        int tmp = 0;
        for(int d = 0; d < arr.length - 1; d++){
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
    }  
}
