package Dsawithkunal;

public class Celingnumwithbinsearch {
    public static void main(String[] args) {
        int [] arr = {2,3,5,7,9,10};
        int target = 4;
        int ans = celling( arr,target);
        System.out.println(ans);
    }
    static int celling(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (target<arr[mid]) {
                end = mid - 1;
            }
            else if (target>arr[mid]) {
                start = mid+1;
            } else {
                return mid;
            }
        } return start;
    }
}
