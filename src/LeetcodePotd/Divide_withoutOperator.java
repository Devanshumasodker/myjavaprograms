package LeetcodePotd;

public class Divide_withoutOperator {
    public static void main(String[] args) {

        int dividend = 56;
        int divisor = 7;

        if (dividend==Integer.MIN_VALUE && divisor > 0){
            System.out.println(Integer.MAX_VALUE);
            return;
        }
        int sum= 0,ans = 0,i=0,k= 0, d= dividend;

      while(dividend >= divisor){
          i = 0;
          while (dividend>= (divisor<<(i+1))){
              i++;
          }
          dividend -= (divisor<<i);
          ans += (1<<i);
      }

        System.out.println(ans);
    }
}
