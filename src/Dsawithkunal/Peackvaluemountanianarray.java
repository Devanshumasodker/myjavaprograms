package Dsawithkunal;

public class Peackvaluemountanianarray {
    public static void main(String[] args) {

    }
    public int peackarrayindex(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                // because is middle element is greater than middle + 1 so we are in decreasing part of array
                // this may be the answer but look at the left side
                // thats why end1!= mid-1
                end = mid;
            }
            else {
                // otherwise we are in increasing or ascending  part of array
                start = mid+1;
            }
        } // thats how in the end the start == end and pointing to the greatest element
        // starts and basically trying to find max element in the array above 2 checks
        // thats why they are pointing in single element,this is the max element bcs of checks
        //
        return  start;// we can return both start and end , bcs in the end both are equal
    }
}
