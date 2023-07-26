package Basicproblems.Problemsofbinarysearch;

public class Subarraysconc {
    public static void main(String[] args) {

        int[] arr = {3,45,67,788,98,90};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print ("* ");
            }
            System.out.println();

        }
    }
}
