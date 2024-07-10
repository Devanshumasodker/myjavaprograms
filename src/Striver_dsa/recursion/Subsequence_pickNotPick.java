package Striver_dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence_pickNotPick {
    public static void printSubsequence(int indx, List<Integer> list , int[]a){
        if(indx==a.length) {
            System.out.println(list);
            return;
        }
        list.add(a[indx] );
        printSubsequence(indx+1,list,a); // TODO: this conditon is for pick

        list.remove(list.size()-1); // TODO: removing element for not pick
        printSubsequence(indx+1,list,a);
    }
    public static void main(String[] args) {
  int a [] = {1,2,3,4};
  ArrayList<Integer> list = new ArrayList<>();
  printSubsequence(0,list , a);
    }
}
