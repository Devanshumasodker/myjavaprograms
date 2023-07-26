package Coatingshery.oncoating;

import java.util.Scanner;

public class Arraybysir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int arr[] = {2, 3, 4, 5, 6, 7};
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < args.length; i++) {
            if (Math.max(max, arr[i]) > arr[i]) {
                System.out.println("first largest" + max);
            } else max = arr[i];
            if (Math.min(arr[i], min) < min) {
                System.out.println("secnd large " +
                        min);}
            else min = arr[i];
            }
            //int max = arr[0];
            //for (int i = 0; i < arr.length; i++) {
            //    c


    }
}