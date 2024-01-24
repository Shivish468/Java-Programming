import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n = sc.nextInt();
        int rev = 0, r;
        while (n > 0) {
            r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }
        if (rev == n) {  
            System.out.println("Number is a palindrome");
        }else {
            System.out.println("Number is not a palindrome");
        }
        sc.close();
    }
}
