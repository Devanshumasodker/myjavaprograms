package Dsawithkunal;

public class Floorwithbinsearch {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,8,10};
        int target = 3;
        int ans = floornum(arr,target);
        System.out.println(ans);
    }
    static int floornum(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target < arr[mid]) {
                end = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
else {
                return mid;}

        }  return end;
    }  // return end;
}
