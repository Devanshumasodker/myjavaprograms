package Striver_dsa.recursion;

public class OptimalIterativeCheckSubsequence {

    public static boolean isSubsequence(String str , String target){
        int i = 0 , j = 0;

        // todo try to debug it by yourself and you will analyze it very clearly

        // first we check the first character if we found it so we will check for
        // another one by following order and in the end if we found all the character in the
        // given string with the same order so we return true
        for ( i = 0; j < str.length() && i < str.length() ; i++) {
            if (str.charAt(i)==target.charAt(j)){
                j++;
            }

        }
        return target.length()==j;
    }

    public static void main(String[] args) {
        // todo this is the subsequence which we want to check so the best wayt is the iterative
        // approach using this we can easily find the length of the given string
        String geek = "geek";
        String givenStr = "lgleeolk";
        System.out.println(isSubsequence(givenStr , geek));



    }
}
