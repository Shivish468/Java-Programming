public class Arm {
    static void armstrongNumber(int dig, int num) {
        int sum = 0, r;
        int n = num;
        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = (int)(sum + (Math.pow(r, dig)));
        }
        if (sum == num) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
    public static void main(String[] args) {
        armstrongNumber(3,153);
    }
}
