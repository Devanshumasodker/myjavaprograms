package Striver_dsa.Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Check_isPrime {

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n%i==0) return false;
        }

        return true;
    }

    public static List<Integer> all_factors(int n , List<Integer> l){
        for (int i = 1; i*i <=n ; i++) {
            if (n%i==0) {
                l.add(i);
                // check the number is not already added in list
                if(n/i!=i) l.add(n/i);

            }
        }
        Collections.sort(l);
        return l;
    }


    public static void main(String[] args) {

        int a = 105;
//        System.out.println(isPrime(a));
        System.out.println(all_factors(a,new ArrayList<Integer>()));
    }
}
