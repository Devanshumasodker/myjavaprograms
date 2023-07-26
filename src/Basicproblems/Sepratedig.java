package Basicproblems;

import java.util.Scanner;

public class Sepratedig {
    static String Armstrongnum(int numb){
        int summi =0;
        while (numb>0){
            summi += 3;
        }
        return "sabu";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2034,count = 0,rem=0,sumCon=0;


        while (a!=0){


            rem = a%10;

sumCon += rem* (int) Math.pow(10,count);
count++;

            System.out.println(rem);
            a/=10;


            //System.out.println(count);
        }
        System.out.println(sumCon);
        System.out.println(rem +" "+count);
    }
}
