package Basicproblems;

import java.util.HashMap;

public class Intersection_of_two_Strings {
    // Java program for finding Intersection of two strings.
    public static void main(String[] args) {
        String s1 = "GeeksforGeeks ";
        String s2 = "Geeks";
        StringBuilder ans = new StringBuilder() ;

        HashMap<Character,Integer> map = new HashMap<>();
        // here we store the frequency of each character present in first string.
        for (int i = 0; i < s1.length(); i++) {
            char singlechar = s1.charAt(i);
            map.put(singlechar, map.getOrDefault(singlechar,0)+1);
        }
        // here we check the same character present the
        for (int i = 0; i < s2.length(); i++) {
            char extract_single_char = s2.charAt(i);
            if (map.containsKey(extract_single_char) && map.get(extract_single_char)>0) {

                ans.append(extract_single_char);
                map.put(extract_single_char,map.get(extract_single_char)-1);
            }
        }
        // here we print the output on the console
        System.out.println(ans);
    }
}
