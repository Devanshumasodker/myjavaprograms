package Striver_dsa.recursion;

import java.util.Arrays;

public class Quick_sortAlgo {
    public static void quickSortAlgo(int[]arr , int low , int high){
        if (low < high){
            int partionIndex = partionIndex(arr,low,high);
            quickSortAlgo(arr,low,partionIndex-1);
            quickSortAlgo(arr,partionIndex+1,high);
        }
    }

    public static int partionIndex(int []arr , int low , int high){
        // TODO we takes two pointer one is i start from low and check the element which
        // todo is greater than pivot element which is always arr[low] the starting index and go in the forward
        // todo i++ until the arrays index limit existed

        int i = low; // 0
        int j = high; // 7
        int pivotElement = arr[low]; // todo the pivot element which is always a starting element
        /* todo similarly we take the j pointer which start from last a[high] and moves in starting j-- until become 0*/
while (i<j) {
    while ( arr[i] <= pivotElement && i < high) {

        i++;
    }

    while (arr[j] > pivotElement && j > low) {
        j--;
    }

    if (i < j) {
        // swap the element

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// then swap the j with the pivot
        arr[low] = arr[j];
        arr[j] = pivotElement;


        return j;


    }
    public static void main(String[] args) {
        int arr [] = {4,6,2,5,7,9,1,3};
       // int pivot = partionIndex(arr,0,arr.length-1);
        quickSortAlgo(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
     //   System.out.println(pivot);

    }
}
