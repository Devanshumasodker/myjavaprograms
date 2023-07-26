package Basicproblems.Problemsofbinarysearch;

import java.util.Arrays;

public class Arraysarrange {
    //public static void main(String[] args) {

    public static void methforfindnegpos(int[] arr){

        int start = 0;
        int end = arr.length-1;


        while (start < end){
            while (start < arr.length && arr[start] < 0)
            {

                start++;

            }
            while (end >= 0 && arr[end]>=0)
            {
                end--;
            }
            if ( start < end)
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

    public  static void bubSort(int [] arr ){

        for (int i = 0; i < arr.length-1 ; i++) {
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }


        }
        System.out.println(Arrays.toString(arr));
    }
    public static void coutPosneginar(int[] arr){
        int pos = 0,neg = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] < 0) neg++;
            else  if (arr[i] > 0) pos++;
        }
        System.out.println(pos +  "  " +  neg  + "  " + (arr.length- (pos+neg))) ;

    }
            public static void main(String[] args) {
                int [] arr = {-1,2, 0,2-3,4};

                methforfindnegpos(arr);
                bubSort(arr);
                coutPosneginar(arr);
              //  System.out.println(Arrays.toString(arr));
            }
        }



