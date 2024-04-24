package StringQuestions;

import java.util.Arrays;

public class Sperate_by_space {

    public static void main(String[] args) {

        String s = "iamyour";
        int [] spaces = {2,4};
        char ans [] = new char[spaces.length+s.length()];
        Arrays.fill(ans,' ');
int start = 0 , e = 0;
//        System.out.println(
//                s.substring(1,1));
        int indx = 0,end = 0;
        String[] an = new String[spaces.length + 1];
        for (int i = 0; i < spaces.length; i++) {
          an[i] =   s.substring(indx,spaces[i]-1);
             indx = spaces[i]-1;
             if (i == spaces.length-1) an[spaces.length] = s.substring(indx);
        }
//        System.out.println(Arrays.toString(an));
        String finalans = "";
        for (int i = 0; i < an.length; i++) {
            for (int j = 0; j < an[i].length(); j++) {
                finalans += an[i].charAt(j) ;
            }
           if(i != an.length-1) finalans += " ";
        }
        System.out.println(s.substring(0,1) + " " + s.substring(1,3) + s.substring(3,s.length()));
        System.out.println(finalans.trim());


    }
}
