package Basicproblems.patterns;

public class Halpf_butterfy {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < 9 ; j++) {
                System.out.print(i+""+j+" ");
            }
            System.out.println();
        }
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        int k = n-2,l=n;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < 9 ; j++) {
                if (j<=k)
                System.out.print("*");
                else if(j>=l && j<8)
                    System.out.print("*");
            }
            l++;
;            k--;
            System.out.println();
        }
    }
}
