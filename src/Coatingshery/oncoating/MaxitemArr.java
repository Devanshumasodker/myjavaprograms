package Coatingshery.oncoating;

import java.util.Arrays;

public class MaxitemArr {
    public static boolean meth(String s){
        int sur = 0;
        int e = s.length()-1;

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(e--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] arr = {2,82,1,3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
        int max = Math.max(arr[0],arr[1]);
        int secmax = Math.min(arr[0],arr[1]);
        for (int i = 2; i < arr.length ; i++) {
            if (max<arr[i]){
                secmax = max;
                max = arr[i];
            }
            else if (secmax<arr[i]) secmax = arr[i];
        }
        System.out.println(max+" "+secmax);
        System.out.println(meth("kaak"));
    }
}
