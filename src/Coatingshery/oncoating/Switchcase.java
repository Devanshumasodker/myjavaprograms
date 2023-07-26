package Coatingshery.oncoating;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.nextLine().charAt(0);
        switch (a){
            case 'a','e','o','i','u' -> {
                System.out.println("vowel");
            }

            default -> System.out.println("consonant");
        }

    }
}
