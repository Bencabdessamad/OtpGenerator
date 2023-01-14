import java.util.*;
public class OtpGene{
    static char[] OTP(int i){
        System.out.println("Generating OTP using random() : ");
        System.out.println("You OTP is  :");
        String numbers = "0123456789";
        Random r = new Random();
        char[] otp = new char[i];
        for(int j=0;j<i;j++){
            otp[j] = numbers.charAt(r.nextInt(numbers.length()));
        }
        return otp;
    }
    public static void main(String[] args) {
        int a =4;
        System.out.println(OTP(a));
}
}