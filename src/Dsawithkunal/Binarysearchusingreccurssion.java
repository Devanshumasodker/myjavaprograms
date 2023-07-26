package Dsawithkunal;
// FOR BETTER UNDERSTANDING MAKE STACK CALLING GRAPH AND TREE REPRESENTATION
public class Binarysearchusingreccurssion {
     static int  binaryser(int[] nums,int target,int s,int e) {
         if (s > e) return -1; // this is base condition where the target is not found;
        int m = s + (e - s)/2;// every time we need to change the middle so that's why its in the func's body
        if (nums[m]==target) return m;//if target found so simply return the ans

        if (target > nums[m]) return binaryser(nums,target,m+1,e);// if the target is greater than m so call the func. again ans change the start parameter
        return binaryser(nums,target,s,m-1);// if the target is not greater than middle so it's less than middle so we simply call the func again change the end post.


    }
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,1};
        System.out.println(binaryser(nums,1,0,nums.length-1));
    }
}
