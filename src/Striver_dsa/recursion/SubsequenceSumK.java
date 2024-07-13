package Striver_dsa.recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequenceSumK {
    public static void
    subsequenceUpToK(int indx , int[]a , int sum , List<Integer> list,int getSum)
    { int c = 0 ;
        if(indx == a.length) { // { 1 2 3}
            if (sum == getSum) {
                System.out.println(list);

            }
            return;
        }

        list.add(a[indx] );
        sum+= a[indx];
//        TODO this condition is used for pick the sum element
        subsequenceUpToK(indx+1,a,sum,list,getSum);

        list.remove(list.size()-1);
        sum-=a[indx];
        subsequenceUpToK(indx+1,a,sum,list,getSum);

        }


    public static int
    subsequenceUpToK_TotalCount(int indx , int[]a , int sum,int getSum)
    { // TODO this function is to find the count of totoal subsequence which have some equals to k
        if(indx == a.length) { // { 1 2 3}
            if (sum == getSum) {
                return 1;

            }
            return 0;
        }


        sum+= a[indx];
//        TODO this condition is used for pick the sum element left for the pick conditions


   int left =     subsequenceUpToK_TotalCount(indx+1,a,sum,getSum);


        sum-=a[indx];
        // TODO the right condition is for not pick
   int right =     subsequenceUpToK_TotalCount(indx+1,a,sum,getSum);

        return left+right;

    }
    public static boolean singlesubsequecesumK(int indx , int[]a , int sum , List<Integer> list,int getSum)
    {
        // TODO this is for printing the single output not print all the subsequences
        if(indx == a.length) { // { 1 2 3}
            if (sum == getSum) {
                System.out.println(list);
                return true;

            }
            return false;
        }

        list.add(a[indx] );
        sum+= a[indx];
//        TODO this condition is used for pick the sum element
        // TODO if the function return true so it will not do further recursion calls
       if(singlesubsequecesumK(indx+1,a,sum,list,getSum)==true) return true;
        list.remove(list.size()-1);
        sum-=a[indx];
       if( singlesubsequecesumK(indx+1,a,sum,list,getSum) == true) return true;

       // TODO if it reaches tho the end
       return false;

    }



    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        int[] arr = {1,2,1};


//    TODO    this is for printing all the subsequence
       // subsequenceUpToK(0,arr,0,ls,2) ;

       // TODO this function is for printing single subsequence
        //singlesubsequecesumK(0,arr,0,ls,2);


       // TODO this function is for count how many subsequence
      int count  = subsequenceUpToK_TotalCount(0,arr,0,2);
        System.out.println(count);

//        this is for print the , anyone subsequence which has some = K;

    }
}
