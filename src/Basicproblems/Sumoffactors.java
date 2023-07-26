package Basicproblems;

public class Sumoffactors {

    public static void main(String[] args) {
        int num = 6,factosum=0;
        for (int i = 1; i < 6 ; i++) {
            if (num%i==0) {
                System.out.println(i);
                factosum += i;
              //  System.out.println(factosum);
            }

        }                System.out.println("is given num is a perfect num ? = "+(factosum==num));

    }
}
