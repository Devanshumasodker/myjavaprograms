package Coatingshery.oncoating;

import java.util.Arrays;
//===cmplt array___rightrotate
public class Arrasrightrotation {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        int t = arr[arr.length-1];
        for (int i = arr.length-1; i > 0 ; i--) {
            arr[i] = arr[i-1];

        }
        arr[0] = t;
        System.out.println(Arrays.toString(arr));
    }
}
