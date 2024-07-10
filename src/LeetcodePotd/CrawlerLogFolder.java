package LeetcodePotd;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class CrawlerLogFolder {

    public static int minOperations(String[] logs) {
   int count = 0;
        for(String i : logs){

            //  String []logs = {"d1/", "../", "../", "../"};
            if(i.length()>=2 && i.charAt(0)!='.'){ count++; //ls.push(i);
                System.out.println(count);}
//System.out.println(count);}
          else if(i.length()==3 && i.charAt(0)=='.' && count>0) { count--; }

        }

        return count;

    }
    public static void main(String[] args) {
   String []logs = {"d1/","d2/","../","d21/","./"};

        System.out.println(minOperations(logs));

    }
}
