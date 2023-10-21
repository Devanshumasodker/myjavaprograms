package Basicproblems.Sorting;

import java.util.Arrays;

/**
 Bubble Sort Algorithm to sort an Integer Array
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean swap;
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {23, 31, 28, 19, 12, 21, 98};
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting: " + Arrays.toString(arr));
    }
}
