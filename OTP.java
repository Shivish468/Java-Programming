import java.util.Random;

public class OTP {
    static char[] Otp(int len) {
        System.out.println("Your OTP is: ");
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[len];
        for(int i=0; i<len; i++){
            otp[i] = numbers.charAt(rndm_method.nextInt(otp.length));
        }
        return otp;
    }
    public static void main(String[] args) {
        int length = 6;
        System.out.println(Otp(length));
    }
}
