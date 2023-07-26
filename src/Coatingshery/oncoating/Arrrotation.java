package Coatingshery.oncoating;

import java.util.Arrays;

public class Arrrotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int t = arr[0];
        for (int i = 0; i <= arr.length-2 ; i++) {
            arr[i] = arr[i+1];


        }
        arr[arr.length-1] = t;

        System.out.println(Arrays.toString(arr));
    }
}
