package Striver_dsa.Maths;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All_primeFactors {

    public static List<Integer> primeFactorsOptimal(int n , List<Integer> l){
        // 650

        for (int i = 2; i*i <=n ; i++) {
            if (n%i==0){
                l.add(i);
                while (n%i==0) n/=i;
            }
        }
        if (n>1) l.add(n);
        Collections.sort(l);
        return l;

    }

    public static int[] prime_factorisazion(int n ){
        // todo prime factorization or smallest prime factor optimal approach
    int [] spf = new  int[1000000+1]; // smallest prime factor
        // each index has it's own smallest prime factor value;

        // initially set each index value as it's index

        for (int i = 2; i < spf.length ; i++) {
            spf[i] = i;
        }

        // smae logic as prime number sieve of erosthenes
        for (int i = 2; i * i <= n; i++) {

            if (spf[i]==i){
                for (int j = i*i; j <= n ; j+= i) {
                    if (spf[j]==j) spf[j] = i;
                }
            }
        }
        return spf;
    }

    public static List<Integer> optimal_appraoch_primefactorization(int n , List<Integer> l){
      int[] spf = prime_factorisazion(n);/// data of prime numbers in the form of array
        while (n>1){
            l.add(spf[n]);
            n = n/spf[n];
        }
        Collections.sort(l);
        return l;
    }
    public static void main(String[] args) {
   int n = 650;
//        System.out.println(primeFactorsOptimal(n,new ArrayList<Integer>()));
      //  System.out.println(optimal_appraoch_primefactorization(n,new ArrayList<>()));


        BigInteger pow = BigInteger.ONE;
        int x = 2,ans = 1;
        int[] a = new int[1000000+1];
        while(n>0){
            if((n&1)==1){
                pow.multiply(BigInteger.valueOf(2));
                n-=1;
            }

            else{
                pow.multiply(pow);
                n= (n>>1);
            }

        } // 10000

  int nk = -2;

         nk = -nk;

        System.out.println(nk);
    }
}
