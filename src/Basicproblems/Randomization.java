package Basicproblems;

public class Randomization {
    public static void main(String[] args) {
        // by using these we can create random otp or 4 digit password
// if you want to know that how this mathod works so you check this by your self
       // System.out.println(Math.random());

        //NOW BY USING THIS METHOD WE ARE CREATING 4 DIGIT OTP IF YOU TRIED THIS METHOD BY YOUR
        // SELF SO YOU KNOW THAT THIS METHOD GIVES RANDOM NUMBER IN POINT BUT WE WANT 4 DIGIT OTP SO WE SOULD DO THID

        double otp = Math.random() * 10000;
        // by multiply by 10000 we get the desire output but still it is in floating point so we simply typecast it in int


        System.out.println( (int) otp );
        // but this just a "jugad soution"
        // what if it comes 0 this is the edgecase so we use diffrent method

// this is the best one
        String OTP = generateOTP(4);
        System.out.println("Generated OTP: " + OTP);

    }
    // this is the best way for genrating random otp
    // this is the secure option
    public static String generateOTP(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("OTP length must be greater than zero.");
        }

        StringBuilder otpBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int digit = (int) (Math.random() * 10); // Generate a random digit (0-9)
            otpBuilder.append(digit);
        }

        return otpBuilder.toString();
    }

}
