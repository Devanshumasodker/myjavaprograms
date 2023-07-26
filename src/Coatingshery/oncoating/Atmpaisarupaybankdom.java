package Coatingshery.oncoating;

import java.util.Scanner;

public class Atmpaisarupaybankdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amt = sc.nextInt();// 4550
        int dohajar = 0;
        if (amt >= 2000) {
            System.out.println( " do hajar =  " + amt/2000);
            amt = amt % 2000;
        }
       if (amt >= 500)
       {
           System.out.println(" 500 ka note = " + amt/500 );
           amt = amt% 500;
       }
       if (amt >= 200)
       {
           System.out.println( " 200 ka not" + amt/200);
           amt = amt % 200;

       }
       if (amt >= 100 )
       {
           System.out.println(" 100 ke note = " + amt/100);
           amt = amt%100;
       }
       if ( amt >= 50 ) {
           System.out.println(" 50 ke note = " + amt/50);
           amt =  amt%50;
       }
        if ( amt >= 20 ) {
            System.out.println(" 20 ke note = " + amt/20);
            amt =  amt%20;
        }
        if ( amt >= 10 ) {
            System.out.println(" 10 ka note = " + amt/10);
            amt =  amt%10;
        }
        if ( amt >= 5 ) {
            System.out.println(" 5 ke note = " + amt/5);
            amt =  amt%5;
        }
        else {
            System.out.println( " bhai itne chillar thode hote hai atm mey" +
                    "le tere bache pese = " +
                    amt );
        }
    }
}
