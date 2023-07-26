package Coatingshery.oncoating;

public class Questionmaxnum {
    // # HOW TO FIND FIRST AND SECOND LARGEST IN GIVEN ARRAY :-->
    //
    public static void main(String[] args) {
        int arr[] = {1, 23, 4, 5, 35, 38, 2, 982,};
        int firstlargestvalue = Math.max(arr[0], arr[1]);
        int Secondlargestvalue = Math.min(arr[0], arr[1]);
        int thirdlargest = 0;


        for (int i = 2; i < arr.length; i++) {
            if (firstlargestvalue<=arr[i]){//bada = 23,<35
                Secondlargestvalue=firstlargestvalue;
                firstlargestvalue=arr[i];

            }
            else if (Secondlargestvalue >= arr[i]) {
                Secondlargestvalue= arr[i];}



        }
        System.out.println(firstlargestvalue);
        System.out.println(Secondlargestvalue);


    }}
