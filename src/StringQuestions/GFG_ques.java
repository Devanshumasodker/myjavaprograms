package StringQuestions;

import java.util.Arrays;

public class GFG_ques {
    public static int[] matchingCnt(int n, String[] x) {
        // code here

        int [] freq = new int[26];
        int ans[] = new int[x.length];
        int c = 0 ;

        for(int i = 0; i < x.length-1 ; i++ ){

            for(int j = 0 ; j < x[i].length(); j++){
                freq[x[i].charAt(j) - 'a'] = i;
            }

            for(int k = 0 ; k < x[(i+1)].length() ; k++){
                if(freq[x[i+1].charAt(k)-'a']==i){
                    c++;
                    // System.out.println(c);
                }
                ans[i] = c;

                Arrays.fill(freq, 0);

            } c = 0;


        } return ans;

    }
}
