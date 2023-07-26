package Coatingshery.oncoating;

import java.util.Arrays;

public class Bublesortsherry {
    public static void main(String[] args) {
        int[] arr = {6,5,4,3,2,1};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    System.out.print(Arrays.toString(arr));
                    System.out.println();
                }

              // System.out.println();
            }
                       //System.out.println(Arrays.toString(arr));

        }
    }
}
