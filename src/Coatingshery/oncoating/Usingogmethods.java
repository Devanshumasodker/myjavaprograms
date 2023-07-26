package Coatingshery.oncoating;

public class Usingogmethods {
    public static int fact(int n){
        if (n<0) return -1;

            int fac = 1;// 3! = 3x2x1 = 6

            for (int i = 1; i <= n ; i++) {
                fac *= i;

            }
            return fac;

    }
    public static boolean isstrongnum(int num){
        // 1 4 5
        int k = num,rem = 0,fact =0;
        //boolean ans = false;
        while (num>0){

             rem = num%10;
             fact += Usingogmethods.fact(rem);
             num /= 10;

        }
        return fact == k;

    }
    public static void main(String[] args) {
        System.out.println(fact(0));

        System.out.println(Usingogmethods.isstrongnum(0));

    }
}
