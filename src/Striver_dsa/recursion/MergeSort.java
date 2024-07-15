package Striver_dsa.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
//  TODO  here the low is the starting index like 0 and high is the ending index a.length-1
    public static void mergeSort(int[]a , int low , int high){
        if (low>=high) return ;
        int mid = (low + high) / 2;
//   TODO     we divide array into 2 part [ low --- mid] and [mid +1  , high];

        mergeSort(a,low,mid);
        mergeSort(a,mid+1,high);
        mergeArray(a,low,mid,high);

//        System.out.println(mergeArray(a,low,mid,high));

    }

    public static void  mergeArray(int[]a , int low , int mid , int high){
        int left_pointer = low; // TODO the start index of first divided array
        int right_pointer = mid+1; // TODO the start index of second divided array

        ArrayList<Integer> temp = new ArrayList<>(); // TODO to store the sorted element

        //TODO compare the each element of left side array to the right side array
        while(left_pointer<=mid && right_pointer<=high){

            if (a[left_pointer] <= a[right_pointer]){ // TODO if the element is lesser than the right to add it
                temp.add(a[left_pointer] );
                left_pointer++;
            }

            else {
                temp.add(a[right_pointer] );
                right_pointer++;
            }
        }
        while (left_pointer<=mid){
            temp.add(a[left_pointer] );
            left_pointer++;
        }
        while (right_pointer<=high){
            temp.add(a[right_pointer] );
            right_pointer++;
        }
// TODO devanshu watch striver video at time stamp 40:33 if you still not remember why we are doing this you will get after doing the dry run
        for (int i = low ; i <= high ; i++){
            System.out.println(temp.get(i-low));
            a[i] = temp.get(i-low);
        }




    }
    public static void main(String[] args) {

        int []a = {5,4,3,2,1};
        mergeSort(a,0, a.length-1); // TODO the arrays value will be updated by performing these method
        System.out.println(Arrays.toString(a));

    }
}
