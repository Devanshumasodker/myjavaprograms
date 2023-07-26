import java.util.Arrays;

public class Arrayrotation {
    public static int[] Arrayrightrotation(int[]arr, int k){
      if (k> arr.length) k = k% arr.length;
        for (int j = 0; j < k; j++) {
            int t = arr[0];
            for (int i = 0; i < arr.length - 1; i++) arr[i] = arr[i + 1];
            arr[arr.length - 1] = t;
        }
        return arr;

    }
    public  static int[] Arrayleftrotation(int[]arr,int k){
      if (k> arr.length) k = k% arr.length;

        for (int j = 0; j < k; j++) {
            int t = arr[arr.length-1];
            for (int i = arr.length-1; i >0 ; i--) arr[i] = arr[i-1];
            arr[0] = t;
        }
        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,};
        int k = 0;
        System.out.println(Arrays.toString(Arrayrightrotation(arr,1)));
        System.out.println(Arrays.toString(Arrayleftrotation(arr,1)));


    }
}
