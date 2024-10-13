package Basicproblems;

public class Strng_methods {
// I write this program to understand what is subsequence and how to solve such problems using recurisioon
    // in a string
    public  static  boolean  print(String s , int ind ,String ds){
        if(ind >= s.length()) {
                System.out.println(ds);
            if (ds.equals("geek")) {
                return true;
            }
            return false;
        }
      boolean l =  print(s,ind+1,ds);

        ds += s.charAt(ind);
    boolean k =     print(s,ind+1,ds);

      return l|k;
    }
    public static void main(String[] args) {
        String s = "1234";
       boolean ans =  print(s,0,"");
        System.out.println(ans);

    }
}
