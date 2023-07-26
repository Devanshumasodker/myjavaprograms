package Basicproblems;

import java.util.Scanner;

//HOW TO FIND HOW MANY DIGITS USING LOG.

public class Findthenumofdigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if (x==0)x=1;
        if (!(x>0)) x = x*(-1);
        x = (int) Math.log10(x )+1;
        System.out.println(x);
    }
}
