package Coatingshery.oncoating.Devanshudoc;


import java.util.Scanner;

public class coatingallques {
    public static void dowhilecoditi(int b){


        do {

            Scanner sc = new Scanner(System.in);
            System.out.println(" hey put a num ");
            int a  = sc.nextInt();
            System.out.println(a);
            System.out.println( " press 0 to repeat");
             b = sc.nextInt();

        }while (b!=0);

    }
    public static void harshadnu(int a){
int t = a , sum = 0;
while (a>0){
    int rem = a%10;
    sum += rem;
    a/=10;

}

        System.out.println( t%sum==0);

    }
    public static void main(String[] args) {

        int a = 18;
        harshadnu(a);
        dowhilecoditi(a);

    }
}
