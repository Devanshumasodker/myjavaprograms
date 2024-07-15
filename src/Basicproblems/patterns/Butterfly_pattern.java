package Basicproblems.patterns;

public class Butterfly_pattern {

    public static void main(String[] args) {
        int n = 5 , k = 8,l=k ;

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < n + (n-1) ; j++) {
                if (i>=j)
                System.out.print("*");
               else if (j>=k && j<n-1)  System.out.print("* ");
                else if (j>=k && j!=n-1)  System.out.print("*");

                else System.out.print(" ");
            }
            k--;

            System.out.println();
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < n + (n-1) ; j++) {
                if (i>=j)
                    System.out.print("*");
                else if (j>=l && j<n-1)  System.out.print(" ");
                else if (j>=l && j!=n-1)  System.out.print("*");

                else System.out.print("*");
            }
            l--;

            System.out.println();
        }


    }
}
