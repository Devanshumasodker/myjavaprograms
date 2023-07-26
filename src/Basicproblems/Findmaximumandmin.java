package Basicproblems;

public class Findmaximumandmin {
    public static void main(String[] args) {
        int arr[] = {4,2,3,1};
        int max = Math.max(arr[0],arr[1] ),sum = 0,min = Math.min(arr[0],arr[1]);
        for (int i = 2; i < arr.length; i++) {

            max = Math.max(max,arr[i]);
            sum = sum+max;
        }
        System.out.println("max = " + max);
        for (int i = 2; i <arr.length ; i++) {
            min = Math.min(min,arr[i]);

        }
        System.out.println("minimumm = " +min);
    }
}
