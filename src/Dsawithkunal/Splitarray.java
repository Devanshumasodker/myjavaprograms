package Dsawithkunal;
//https://leetcode.com/problems/split-array-largest-sum/
public class Splitarray {
    public static void main(String[] args) {

    }
    public int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length ; i++) {
            start = Math.max(start,nums[i]);//in the end it contains greatest element in the array
            end += nums[i];

        }
        // now we applied binary search
        while (start < end){
            // mid is potential ans in the starting
            int mid = start+(end-start)/2;
            // calculate how many pieces or count u divided inwith the max sum
            int sum  = 0;
            int pieces = 1;
            for (int num : nums) {
                if (sum + num > mid) {
                    // means that u can't add on this subarray make new one
                    //sum = num;
                    sum = num;
                    pieces++;

                }
                else {
                    sum += num;
                }
            }
if (pieces > m){
    start = mid+1;
}   else  {
    end = mid;
}
        }
        return end;// bcs in the end both are become same;
    }
}
