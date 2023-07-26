package Coatingshery.oncoating;
//pallandrome
public class practice {
    public static void main(String[] args) {
        int arr[] = {1,5,4,5,1};
        int  temp[]  = new int[arr.length];
        boolean ans = false;

        int j = arr.length-1;//j=2;
        for (int i = j; i >=0; i--) {
            temp[j-i] = arr[i];
           // if (temp[(j-1)] == arr[(j-i)]) ans = true;

           // System.out.println(j +"-" + i + " = " +(j-i));//this line is for understanding how thw loop is woeking
        }
       System.out.println( " array 1 " + " array 2");
        for (int i = 0; i < arr.length; i++) {
            if (temp[i]==arr[i]){ ans = true;}
            else ans = false;

            System.out.println(temp[i]+" =  "+ arr[i] );

        }
        System.out.println(ans);
    }


}
