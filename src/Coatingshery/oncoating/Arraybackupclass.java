package Coatingshery.oncoating;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arraybackupclass {
    public static void vowelsbatao(String s) {
        int consonent = 0, vowel = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'a', 'e', 'i', 'o', 'u' -> vowel++;
                default -> consonent++;
            }
        }
        System.out.println("no of conso :--> " + consonent);
        System.out.println("no . of vowel :--> " + vowel);
    }

    public static String toggledtheString(String s) {
        String op = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                op = op + (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                op = op + (char) (ch - 32);
            } else {
                op = op + ch;
            }//1704leet
        }
        return op;

    }
  public static int bs(int [] arr ,int s ,int e ,int k){
        if (arr.length>=5) return -1;      if (s>e) return -1;
        int m = s+e/2;
        if (arr[m]>k) bs(arr,s,m-1,k);
        if (arr[m]==k) return m;
        return bs(arr,m+1,e,k);
  }
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5};
        System.out.println(bs(arr,0, arr.length-1, 4));
    }
}