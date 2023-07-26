package Basicproblems;

import java.util.Scanner;

public class Howtofindmax {
    public static void main(String[] args) {
        // # HOW TO FIND WHICH NUMBER IS GREATEST BY USING ONLY IF ,ELSE
        Scanner dev = new Scanner(System.in);


        int Pehlanumber,Dusranumber,c;
        Pehlanumber = dev.nextInt();
        Dusranumber = dev.nextInt();
        c = dev.nextInt();
        if (c>Dusranumber){
            if (c>Pehlanumber) System.out.println(c+" is greatest");
            else System.out.println(Dusranumber+"is greatest");
        }
     else    if (Pehlanumber>Dusranumber){
            if (Pehlanumber>c) System.out.println(Pehlanumber +" is greater");
            else System.out.println(c+" is greater ");

        }
        else System.out.println(Dusranumber +" is greater");


    }
}
