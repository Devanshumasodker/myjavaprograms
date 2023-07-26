package Dsawithkunal;


import java.util.Arrays;

public class Changeindex {
    public static void main(String[] args) {
int number [] ={3,4,5,6,};
        System.out.println(Arrays.toString(number));
        change(number);

        System.out.println(Arrays.toString(number));
    }
    static void change (int arr[]){
        arr[0]=5;
    }
}
