package Coatingshery.oncoating;

import java.util.Arrays;

public class bublesortpracti {
    public static void main(String[] args) {

        int [] arr = {3,2,6,3,6};
        buble(arr);
        System.out.println(Arrays.toString(arr));
    }
     public static int swap (int a , int b){
        int t = b;
        b = a;
        a = t;
        return a;
    }
    static void buble(int[] arr){
        for (int i = 0; i< arr.length;i++)
            for (int j = 1; j < arr.length-i; j++) {

                if (arr[j] < arr[j-1]){
                    swap(arr[j],arr[j-1]);
                   // int t = arr[j-1];
                    //arr[j-1] = arr[j];
                    //arr[j] = t;
                }
            }
    }
}
