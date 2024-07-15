package Basicproblems;

import java.util.Arrays;

public class basicproblem {

    public static int[] removezerowithoutextraspace(int []arr ){
        int k = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]!=0) arr[k++] = arr[i];
        }

        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }

        return arr;
    }

    public static void main(String[] args) {
        int []arr = { 1,0,5,8,0,0};
        System.out.println(Arrays.toString(removezerowithoutextraspace(arr)));
        // remove zeroes program using single variable
        //arr    i  //0 1 2 3 4 5
        //arr2[k]  k//0 1 2 3  4 5
        int []arr2 = new int [arr.length];
        int k = 0 ;
        System.out.println(1==0);
        for (int i = 0 ; i < arr.length ; i++){


            if ( arr[i]!=0) {
                arr2[k] = arr[i]; //
                k = k+1;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
