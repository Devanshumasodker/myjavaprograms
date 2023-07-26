package Dsawithkunal.sortingalgos;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,9,2,12,6,3};
        buble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void buble(int[] arr){
        // run the steps n-1 times;
         boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step max item will come in last respective index

            for (int j = 1; j < arr.length-i; j ++) {
                //swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
            }

        }
// if u didn't swapped for a particular value,
// it means the array is already swapped so stop the program
if (!swapped) {
    //not false give me true;
    break;
}
        }
    }
}
