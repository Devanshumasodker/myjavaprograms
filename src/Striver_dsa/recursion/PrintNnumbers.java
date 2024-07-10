package Striver_dsa.recursion;

public class PrintNnumbers {
    public static void print(int n){
        if (n<1)return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        print(5);
        printReverse(5);
    }

    public static void printReverse(int i) {

        if (i<1) return;
        System.out.println(i);
        printReverse(i-1);

    }
}
