import java.util.Scanner;
//Array backup class,make an array and its sum
public class Dev {
    public static void main(String[] args) {
        int a = 4,sum=0;
        Scanner k = new Scanner(System.in);
        String s = " ";
       System.out.println("daliye ek num");
       int c = k.nextInt();
      //  System.out.println();
        int hum [ ] = new int[c];
        for (int i = 0;i< hum.length;i++){
            System.out.println("enter index " + (i+1));

            hum[i]= k.nextInt();}

        for (int j = 0; j < hum.length; j++) {
           // System.out.println( hum[j]);
           // System.out.println(hum.length-1);
            if (j== hum.length-1) s += hum[j];
          else     s +=  hum[j] + " + ";
     sum += hum[j];
        }
        System.out.print(sum+" = "+s);
    }
}
