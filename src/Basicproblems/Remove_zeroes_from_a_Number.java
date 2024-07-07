package Basicproblems;

import java.util.Arrays;

public class Remove_zeroes_from_a_Number {
    public static void main(String[] args) {

        int N = 10000,ans = 0;

        while (N>0){
            int divisor = (int)Math.pow(10, (int)Math.log10(N));
            ans*=10;
            ans += N / divisor;
            N%= divisor;
        }
        System.out.println(ans);
//        System.out.println(removezero(20030));
//       int N=50505; // given Number
//        int ans = 0;
//        // log function to find the number of digit in constant time
//        int length_of_N = (int) Math.log10(N)+1;
//
//       // storing the values for every digit in the number N
//        int [] arr = new int[length_of_N ];
//
//        for (int i = arr.length-1; i >=0 ; i--) {
//            arr[i] = N%10;
//
//
//
//            N/= 10;
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i]!=0) {
//                ans*=10;
//                ans += arr[i];
//            }
//
//        }
       // showing the output on the console
//        System.out.println(ans);


    }

    public  static int removezero(int n){
        int ans = 0;
        int length_of_N = (int) Math.log10(n)+1;
        int [] arr = new int[length_of_N];

        for (int i = arr.length-1; i >=0 ; i--) {
            arr[i] = n%10;
            n/= 10;
        }
        for (int i = 0; i < arr.length; i++) {
            ans*=10;
            if (arr[i]!=0) ans+=arr[i];

        }
        return  ans;
    }
}
