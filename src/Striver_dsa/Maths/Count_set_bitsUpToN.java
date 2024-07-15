package Striver_dsa.Maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TOdo the question is you need to find the count of set bits sum 1 to n
// TODO n = 3 , 00 01 10 11 => 4
public class Count_set_bitsUpToN {

    public  static  int nearestPowOf2(int n){
        int x= 0;
        while((1<<x)<=n) {
            x++;
        }

        return x-1;
    }
    public static void main(String[] args) throws IOException {
        // todo just uses buffer reader just for practice.
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number jaha tak ki setbit count karna 1 to n tak");

        int  n = Integer.parseInt(bfr.readLine()); // TODO the in which you need to count set bits upto n


//      todo step 1 count the nearest pow of  2 of that number which is x
//       then formula to find all the set bits before 2^x - 1 is ( 2^x-1 * x )
//        then minus the bits of largest number n - 2^x + 1
//         then update the value n = n - 2^x

// first count nearest pow of 2^x

        int x = nearestPowOf2(n),totalSetBitsSum = 0;

       // System.out.println(x);

while (n>0) {
    x = nearestPowOf2(n);

   int setBitsBeforeX = (1 << (x - 1)) * x; // 2 pow of x-1 * x

   int countsOfgreatesBits = n - (1 << x) + 1;

   totalSetBitsSum += countsOfgreatesBits+ setBitsBeforeX;
    n =( n - (1 << x));
}

        System.out.println(totalSetBitsSum);












    }
}
