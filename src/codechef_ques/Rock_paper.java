package codechef_ques;

import java.util.HashMap;

public class Rock_paper {
    public static int first(int[]arr , int i , int target){
        if(i==arr.length-1) return -1;
        if(arr[i]==target) return i;
        return first(arr,i+1,target);
    }
    public static void main(String[] args) {



        String  s = "abcde", t = "edbac";int c = 0;

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < t.length() ; i++) {

            map.put(t.charAt(i),i);

        }
        System.out.println(map);

        for (int i = 0; i < s.length(); i++) {

            c+= Math.abs(map.get(s.charAt(i))-i);
        }
        System.out.println(c);




    }
}
