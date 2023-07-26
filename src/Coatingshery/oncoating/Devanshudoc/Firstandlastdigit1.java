package Coatingshery.oncoating.Devanshudoc;
//HOW TO FIND THE FIRST AND LAST DIGIT OF ANY NUMBER:->
public class Firstandlastdigit1 {
    public static void main(String[] args) {
        int a = 345;
        int temp = a;
        int lastdigit = a;

        int rem,sum=0;
        while (a!=0){
           // rem = a%10;//this give us the remainder means the last value
           // System.out.println(rem);
            sum=temp/2;
            temp = a%10;
            a = a/10;// to short the term;

        }
        System.out.println(temp);

        System.out.println(sum);
    }
}
