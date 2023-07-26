package Basicproblems;

public class Pattern {
    public static void pattern2(){
        int a = 6;
        for (int i = 1; i < a ; i++) {
            for (int j = 1; j < a-i; j++) {
                System.out.print("* ");


            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }
    public static void reflectedtriangle(){
        int a = 6;
        for (int i = 1; i < a ; i++) {
            for (int j = 1; j <= a-i; j++) {
                System.out.print(" ");


            }
            for (int j = 1; j < i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int a = 5;
        for (int i = 1; i < a; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print((char) (j+64));

            }
            System.out.println();

        }

        pattern2();
        reflectedtriangle();
    }
}
