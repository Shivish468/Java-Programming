import java.util.Scanner;

public class LCM {
    static int gcd(int a, int b) {
    if (b == 0) {
        return a;
    }
    return gcd(b, a % b);
    }
    static int lcm(int a, int b) {
        return (a * b)/gcd(a, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("LCM of two numbeer is: " +lcm(a, b));
        sc.close();
    }
}
