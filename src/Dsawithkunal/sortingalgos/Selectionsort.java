package Dsawithkunal.sortingalgos;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int [] arr = {4,2,1,0};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void selectionsort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            // find the maximum element in the array and swap with the correct index
            int last = arr.length-i-1;
            int maxindex = getmaxindex( arr,0,last);
            swap(arr,maxindex,last);
        }
    }
    static void swap( int [] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

     static int getmaxindex(int[] arr, int start, int end) {
        int max = start;

        for (int i = start; i <=end ; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
