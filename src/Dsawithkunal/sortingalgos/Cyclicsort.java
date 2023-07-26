package Dsawithkunal.sortingalgos;

import java.util.Arrays;

// when give the distinct number(1 to n) use cyclic sort
//3 3 2 1 4
//1 2 3 3 4
//0 1 2 3 4
public class Cyclicsort {
//DEBUG THE WHOLE PROGRAM FOR BETTER UNDERSTANDING THIS IS FOR YOU MY BETTER VERSION
    // IF FOUND YOU FIND THIS USEFULL MAKE A COMMENT FOR NEXT VERSION
    public static void main(String[] args) {
        int[]arr= {1,4,3,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void sort(int[] arr){
        int i = 0;
      while (i<arr.length){
          int Correct = arr[i]-1;
          if (arr[i]!= arr[Correct]) {
              swap(arr, i, Correct);
          }
          else i++;

      }

    }

    public static void swap(int[] arr, int First, int Second) {
        int temp = arr[First];
        arr[First]= arr[Second];
        arr[Second]= temp;
    }

}
