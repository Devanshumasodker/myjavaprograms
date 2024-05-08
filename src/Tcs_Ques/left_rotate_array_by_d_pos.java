package Tcs_Ques;

import java.util.Arrays;

public class left_rotate_array_by_d_pos {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7}; int d = 1; // 3 4 5 6 7 1 2

//        System.out.println(Arrays.toString(rotateArr(arr,d)));
        System.out.println(Arrays.toString(space_time_fast_rotate(arr,d)));
    }

    public static int[] rotateArr(int[]arr , int d){
       int n = d% arr.length;
        for (int j = 0; j < d; j++) {
            int t = arr[0];
            for (int i = 0; i < arr.length-1; i++) {
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = t;
        }
        return arr;
    }

    public static int[] space_time_fast_rotate(int[]arr ,int d){
        int n = d % arr.length;
        int []temp = new int[arr.length];
        int k = 0;

        for (int i = 0; i < n; i++) {
            temp[i+ (arr.length-n)] = arr[i];
        }
        for (int i = n; i < arr.length ; i++) {
            temp[i-n] = arr[i];
        }
        return  temp;//n>1? temp : arr;
    }



}
