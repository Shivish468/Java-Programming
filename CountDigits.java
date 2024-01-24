import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n = sc.nextInt();
        int count = 0, r =0;
        while (n>0) {
            r = n%10;
            count++;
            n /= 10;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
