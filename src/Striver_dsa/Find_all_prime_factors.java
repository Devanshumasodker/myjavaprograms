package Striver_dsa;

import java.util.ArrayList;
import java.util.List;

public class Find_all_prime_factors {
    // this is the bruteforce/naive approach
    public  static List<Integer> findAllPrimeFactors(int n){
        ArrayList<Integer> all_prime_factors = new ArrayList<>();
        for (int i = 2; n>1 ; i++) {

            if(n%i==0) {
                while (n%i == 0){
                    all_prime_factors.add(i);
                    n/= i;
                }
            }
        }
        return all_prime_factors;

    }

    public static int ans(){
        int [] arr = {1,2,3,4,5};

        int s = 0,e = arr.length-1,t = 4;

        while (s<=e){  // 1 2 3 4 5
            int m = (s+e)/2;
            if (t > arr[m]) s = m+1; // 4 > 3
            else if (t < arr[m] ) {
                e = m-1;
            } else if ( t == arr[m]) {
                return m;
            }
            // continue;
            System.out.println(m);

        }

        System.out.println(-1);
        return -1;
    }


    public static void main(String[] args) {
int n = ans();
        System.out.println(n);
    }
}
