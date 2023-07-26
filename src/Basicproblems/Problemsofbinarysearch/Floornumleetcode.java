package Basicproblems.Problemsofbinarysearch;

public class Floornumleetcode {
    public static void main(String[] args) {
        int arr[] = {1, 3, 6, 7, 8, 10};
        int target = 5;
        int ans = binarysearchfloor(arr, target);
        System.out.println(ans);
    }


     static int binarysearchfloor(int[] arr, int target) {
         int start = 0;
         int end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             if (target < arr[mid]) {
                 end = mid - 1;
             } else if (target > arr[mid]) {
                 start = end + 1;
             } else {
                 return mid;
             }
         }
         return end;

     }

}

