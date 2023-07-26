package Coatingshery.oncoating;

import java.util.Arrays;

public class Arrayreversesort {
    public static void main(String[] args) {
        int [] arr = {8,2,4,1,3,4,6};
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print(Arrays.toString(arr));
    }
}
