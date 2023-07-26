package Basicproblems;

import Coatingshery.oncoating.J16quesusingmeth;
import Dsawithkunal.Array;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Scanner;
//2057. Smallest Index With Equal Value
//2037. Minimum Number of Moves to Seat Everyone

public class RunTestclss {//3 4 50 0
    public static boolean checkzero(int[]nums){
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) return false;
        }
        return true;
    }

    public static int minimumOperations(int[] nums) {
        //Arrays.sort(nums);
        int min = Integer.MAX_VALUE,count =0;
       //
        while (checkzero(nums)) count++;

        for (int i = 0; i < nums.length; i++)
            if (nums[i]<min && nums[i]!= 0) min = nums[i];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0) {
                nums[i] = nums[i] - min; count++;
            }
        }
       return count;

    }

    public static boolean ispallendrome2(int[] nums){
        if (ispallendrome(nums)) return false;
        return true;
    }
    public static boolean ispallendrome(int[] nums){
       // Arrays.sort(nums); int
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]!=nums[j]) count++;
            }
        }
        return count > 0;
    }

    public static void main(String[] args) { // [62,29,29,29,29,29,29,29,29,29,29,29,62]
       // int[] colors = {62,29,29,29,29,29,29,29,29,29,29,29,62};
 int [] nums = {1,2,3,1};
       // System.out.println(Minmu(nums));
        System.out.println(ispallendrome(nums));
    }

}
