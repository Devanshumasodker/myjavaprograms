package Basicproblems;


import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// java programme for checking a String contains only ASCII characters.
public class Ascii_value_of_char {
    public static void main(String[] args) {
        String s1 = "geeks for geeks";


        Pattern pat = Pattern.compile("\\b\\w");
        Matcher Match = pat.matcher(s1);

        StringBuilder answer = new StringBuilder();
        while (Match.find()) {
            Match.appendReplacement(answer, Match.group().toUpperCase());
        }
        Match.appendTail(answer);


        System.out.println(answer);

        //TODO first one
//        String str = "this! is. a.. !java test";
//        Pattern pat = Pattern.compile("\\b(\\w)");
//        Matcher Match = pat.Match(str);
//
//        StringBuffer answer = new StringBuffer();
//        while (Match.find()) {
//            Match.appendReplacement(answer, Match.group(1).toUpperCase());
//        }
//        Match.appendTail(answer);
//        System.out.println(answer.toString()); // This Is A Java Test


// TODO second one










//        System.out.println( "is s1 contains only ASCII characters :"+ s1.matches("\\A\\p{ASCII}*\\z"));
//
//        System.out.println( "is s2 contains only ASCII characters :"+ s2.matches("\\A\\p{ASCII}*\\z"));


    }
}
