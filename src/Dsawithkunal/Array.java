package Dsawithkunal;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int ans = 0;
        //Scanner in = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
       // int t = in.nextInt();
        int[] nums = {1,2,3,4};
        int sum = 0;
        int [] newarr = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            newarr[i] = sum;
            //newarr[i+nums.length] = nums[i];

        }
        System.out.println(Arrays.toString(newarr));


    }
}