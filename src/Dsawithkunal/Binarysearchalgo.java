package Dsawithkunal;

public class Binarysearchalgo {
    public static void main(String[] args) {
        int [] arr = { 2,3,4,5,6,7,8,9,12};
        int target = 2;
        int ans = binarysearch(arr,target);
        System.out.println(ans);

    }
    static int binarysearch(int[]arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int midvalue = start +( end -start)/ 2;

            if (target<arr[midvalue]) {end = midvalue-1;}
else  if (target>arr[midvalue]) {start = midvalue+1;}
else
{ return midvalue;}
        }
        return -1;

    }
}
