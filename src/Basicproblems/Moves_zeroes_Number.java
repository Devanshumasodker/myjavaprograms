package Basicproblems;

import java.util.Arrays;

public class Moves_zeroes_Number {
//
//
//    public static void movezeroes(int n){
//
//        int digit_length =(int) Math.log10(n)+1; // find the number of digits
//        int []arr = new int[digit_length];
//        int ans = 0,index =0;
//
//        while (n>0){
//            int dividend = (int) Math.pow(10,(int)Math.log10(n)) ;
//            arr[index++] = n/dividend;
//            n%=dividend;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            ans*=10;
//            ans+= arr[i];
//        }
//        System.out.println(ans);
//
//
//    }
    public static void main(String[] args) {

        int n = 1600709;

        int tens = 1, temp = 0, intial_length = (int) Math.log10(n) + 1;
        while (n > 0) {
            temp *= 10;
            int length = (int) Math.log10(n);
            int divident = (int) Math.pow(10, length);
            //  System.out.println(n/divident);

            if (n / divident == 0) {
                tens *= 10;
            } else {
                temp += n / divident;
            }
            n %= divident;
        }
            int number_of_zeroes = (int)Math.pow(10,intial_length-(int)(Math.log10(temp)+1));
            int ans = temp * number_of_zeroes;
        System.out.println( ans);

    }

    }
//    int ans = temp * (int)Math.pow(10,intial_length-(int)(Math.log10(temp)+1);
//        System.out.println( temp * (int)Math.pow(10,intial_length-(int)(Math.log10(temp)+1) ));




