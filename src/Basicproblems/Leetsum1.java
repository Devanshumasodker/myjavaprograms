package Basicproblems;

import java.util.Arrays;

public class Leetsum1 {
    public static void leetcode1(int[]arr,int target){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    int[] a = {i,j};
                    System.out.println(Arrays.toString(a));
                    break;

                } break;




            }

        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6};
        int target = 8, s = 0;

        leetcode1(arr,target);

    }
}