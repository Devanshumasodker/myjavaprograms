public class Jcmtest1 {
    // empty class for contributors
    public static void main(String[] args) {  
        int arr[] = { 1, 2 ,5,6 ,4 ,1};
        int n = 6; 
        int sumOfarr = 0; 
        int sumOfn =0; 
        for(int i =0; i<n ; i++)
        {
            sumOfn+=(i+1);
            sumOfarr+=arr[i];

            sumOfarr=sumOfarr^sumOfn;
        }
        System.out.println(sumOfarr);

    }
}
