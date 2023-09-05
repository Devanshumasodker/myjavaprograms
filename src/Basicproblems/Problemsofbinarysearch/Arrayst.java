package Basicproblems.Problemsofbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayst {
    public static void arrayjas(){
        Scanner sc = new Scanner(System.in);
        // this is used as a comment
        System.out.println("inter size ");
        int size = sc.nextInt();
        int sum = 0;
        int [] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

            // System.out.print(arr[i]+ "+ " );
        }
        for (int i = 0; i < arr.length ; i++) {
            if (i == arr.length-1)
                System.out.print(arr[i]);
            else System.out.print(arr[i] + " + ");
        }

        System.out.println(" = " + sum);


    }
    public static void scondgreat(){
        int [] arr = { 12 ,34 ,56 ,78,77};
        int max = Math.max(arr[0],arr[1]);
        int Max2 = Math.min(arr[0],arr[1] );
        for (int i = 2; i < arr.length ; i++) {

            if (max < arr[i]) {
                Max2 = max;
                max = arr[i];
            }
            else if (Max2< arr[i] ) {
                Max2 = arr[i];
            }
            System.out.println( max + " " + Max2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
scondgreat();
       // System.out.println(Arrays.toString(arr));
    }
}
