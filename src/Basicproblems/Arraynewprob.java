package Basicproblems;

import java.util.Arrays;

public class Arraynewprob {


    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 23, 45, 7, 21, 6, 45, 7};
        int c = 0, k = 0;
        int[] t = new int[arr.length-1];
        int x = 0;//arr-1 bcs out of bound incep......;
        for (int a = 0; a < arr.length; a++) {

            if (arr[a] < 9) {
                t[k++] = arr[a];
               // k++;
            }
            else /*if (arr[a]>9) */{

                for (int i = k; i < arr.length-1; i++) {
                    if (arr[i]>arr[i+1]) {
                        int tem = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = tem;

                    } //k!=k++ out of bound
                    t[i] = arr[i];

                }
//9>=9 inception
            }
        }


        }
    }

