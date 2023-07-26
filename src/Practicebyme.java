import java.util.Scanner;
// by this code i learn reverse loop in detail
//#pallendrome temp array
public class Practicebyme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers u want");
        boolean var = false;
        int k = sc.nextInt();
        boolean ans = false;
        int arr[] = new int[k];
        int temp[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();


        }


        for (int j = arr.length-1; j >=0; j--) {
            temp[arr.length-1-j] = arr[j];
            if (arr[(arr.length-1)-j]==temp[arr.length-1-j]) ans = true;
            else  ans = false;//) System.out.println("true");
            //  System.out.println(arr[arr.length-1-j] = temp[j]);
            // else System.out.println("false ");
        }
          /*  for (int i = 0; i < arr.length; i++) {
                if(arr[i]==temp[i]){ ans = true;}
                break;
            }*/
        System.out.println(ans);

}





    }
