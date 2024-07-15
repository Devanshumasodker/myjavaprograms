package Basicproblems.NumberSystemBits;

public class DecimalToBinaryViceVersa {
    public  static void  DecimalToBinary(int n ){
        String s  = "";
        while(n>=1){
            if ((n&1) ==0) s+=0;
            else s+= 1;
            n>>=1; // todo divide by 2 a >> b => a * 2^b ( ^ is represent power)

        }
        System.out.println(new StringBuilder(s).reverse());
    }
    public static  void BinaryToDecimal(int n){
        int ans = 0;
        int pow_ofTwo = 0;
        while(n>0){
            int rem = n%10;
            ans += (1<<pow_ofTwo) * rem;
            n/=10; // from which base we want to convert
            pow_ofTwo++;
        }

        System.out.println(ans);
    }
    public static void DecimalTOBaseAny(int n,int base){
        int ans = 0;
        int pow = 1; // because any pow 0 is equal to 1;

        // divide the number to the base in which want to convert until it become 0
        while (n>0){
            int remainde_digit = n%base;

            // now instead of reversing we use 10's position to reverse the num
            ans += remainde_digit * pow;

            // update n
            n/=base;

            // now increase the power value to it's 10s position
            pow*= 10;
        }

        System.out.println(ans);
    }
    

    public static void main(String[] args) {
        int n = 88 , base = 8;






    }
}
