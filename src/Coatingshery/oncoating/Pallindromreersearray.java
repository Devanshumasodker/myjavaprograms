package Coatingshery.oncoating;

import java.util.Arrays;

//#1 algo how to find pallondromic num;
public class Pallindromreersearray {
    public static void main(String[] args) {
        int s[] = {5,5, 45, 5, 3,4,5,6,6,7,7,8,9,0,0,6,4,3,5};
       boolean ans = true;
int j = s.length-1;
        for (int i = 0; i < s.length/2; i++) {
            if(s[i]!=s[j-i]) {//WE CAN ALSO USE HERE J-- INSTEAD OF J-i
                ans = false;
            }
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(s));

    }
}
