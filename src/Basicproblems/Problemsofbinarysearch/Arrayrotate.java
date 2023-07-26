package Basicproblems.Problemsofbinarysearch;

import java.util.Arrays;

public class Arrayrotate {
    public static void rightArrrotate(int[]arr){
        int t = arr[arr.length-1];

        for (int i  =  arr.length -1  ; i >= 1; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] =  t;
       // System.out.println(Arrays.toString(arr));

    }
     public static void arrminrotate(int[] arr , int ktimes){

        int k = 0;
if (ktimes >= arr.length) {
    ktimes =  ktimes % arr.length;
    System.out.println(ktimes);
}

             int[] t = new int[arr.length];
             for (int i = ktimes; i < arr.length; i++) {
                 if (k < arr.length) {
                     t[k] = arr[i];
                     k++;
                 }
             }
             for (int i = 0; i < ktimes; i++) {
                 if (k < arr.length) t[k++] = arr[i];

             }

         System.out.println(Arrays.toString(t));

     }
     public static void arrleftrotate(int []arr , int ktimes){
        int []tem = new int[arr.length];
        //  0 1 2 3
         // 1 2 3 4  =
         // 4 1 2 3 = 1
         // 3 4 1 2 = 2
         // 2 3 4 1 = 3

     }
    public static void main(String[] args) {
        //            0 1 2 3 4
        int [] arr = {1,2,3,4};//   2 3 4 1 = 1
                   // 5 1 2 3 4    // 3 4 1 2 = 2
                   // 0 1 2 3 4    // 4 1 2 3 = 3



        arrminrotate(arr,17);


    }
}
