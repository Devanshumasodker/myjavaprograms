public class Array {
    public static void main(String[] args) {


        int k = 3,sum = 0;

        int[] arr = {1,2,3};//new int[k];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println( " the sum of all lement " + sum  + "+" + arr[i]);
            sum = sum + arr[i];
          //  System.out.println(sum + "=" + sum  + "+" + arr[i]);
        }
        System.out.println(sum);
    }
}
