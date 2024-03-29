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
            char character = s1.charAt(i);
            map.put(character, map.getOrDefault(character,0)+1);
        }
        // here we check the same character present the
        for (int i = 0; i < s2.length(); i++) {
            char character = s2.charAt(i);
            if (map.containsKey(character) && map.get(character)>0) {

                ans.append(character);
                map.put(character,map.get(character)-1);
            }
        }
        // here we print the output on the console
        System.out.println(ans);
    }
}
