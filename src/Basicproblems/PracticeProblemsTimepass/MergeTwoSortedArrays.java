package Basicproblems.PracticeProblemsTimepass;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] n1 = {1,2,3,4,0,0,0};
        int []  n2 = {1,2,4,};

        List<Integer> ds = new ArrayList<>();
        int l = 0;
        int r = 0;

        // todo this is about the size of the arrays which is already given in leetcode
        int m = 3,n = n2.length;
        int k = 0;

        while(l < m && r < n ){

            if (n1[l] <= n2[r] && n1[l] > 0 ){
                n1[k] = n1[l];
                l++;
            }
            else {
                int curr = n2[r];
                n1[k++] = curr;
                r++;
            }


        }
        while (l < m){

            n1[k] = n1[l];
            l++;
        }
        while (r<n){
            ds.add(n2[r]);
            n++;
            r++;
        }
        System.out.println(ds);
    }
}
