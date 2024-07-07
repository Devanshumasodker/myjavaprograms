package LeetcodePotd;

public class Waterbottle {
    public static void main(String[] args) {
        int a = 9 , b = 3; //a = bottles we hava , b = bottles we can exchange

        int ans = a; int t = 0;
        while(a > 1){


            ans +=  a/b; // 22
//            System.out.println(ans);
            int rem = a%b; // 2
            ans +=( (rem/b) + rem) / b;// 5 + 2 / 3
            a = rem + a/b; // 7
//            System.out.println(ans);
//            System.out.println(a);


        }

        System.out.println(ans);
    }
}
