package Tcs_Ques;

import java.math.BigInteger;
import java.util.HashMap;

public class Hello {
    public static void main(String[] args) {


        System.out.println(find_first_non_repeating(new int[]{1,12,3}));
        System.out.println(find_first_non(new int[]{1,12,3}));
    }
    public static int find_first_non(int[]arrr){
        int [] array = { 7,5,2,-1,3,0};
//        boolean arr2[] = new  boolean[array.length];
boolean is_true =  true;
//        Arrays.fill(arr2,true);
        for (int i = 0; i < array.length-1; i++) {
               int t = array[i];
            for (int j = i+1; j < array.length ; j++) {
                if (t == array[j] ) is_true  = false;
            }
            if (is_true) return array[i];
            is_true = true;
        }
        return -1;
    }
    public static int find_first_non_repeating(int[]arrr){
        int [] arr = { -1,5,2,-1,3,0};
        int ans = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int a : arr) mp.put(a , mp.getOrDefault(a,0)+1);

        for (int i = 0; i < arr.length-1 ; i++) {

            if (mp.get(arr[i])==1) {

               return arr[i];
            }
//            System.out.println(mp.get(arr[i]));
        }
        return -1;
    }
}
