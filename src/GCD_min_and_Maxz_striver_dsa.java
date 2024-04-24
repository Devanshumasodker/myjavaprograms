public class GCD_min_and_Maxz_striver_dsa {

    public static int[] bucket(int[] n){

        int max = n[0];
        int min = n[0];

        for(int i = 0;i<n.length;i++){

            if(n[i]>max) max = n[i];
            if(n[i]<min) min = n[i];
        }

        return new int[]{max,min};

    }

    public static int gcd(int a, int b ){

        int max , min,gcd = a ;

        while(a!=0&&b!=0){
            max = Math.max(a,b);
            min = Math.min(a,b);
            a = max;
            b= min;
            a = a%b;
        }
return a==0 ? b : a;
    }


    public static void main(String[] args) {
//        System.out.println(        gcd(31,12));

        int []nums = {7,5,6,8,3};


        System.out.println(findGCD(nums));
    }
    public static int findGCD(int[] nums) {
        int a = bucket(nums)[0];
        int b = bucket(nums)[1];
        return  gcd(a,b);
    }
}
