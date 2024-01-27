import java.util.Scanner;

public class Power {
    static int power(int x, int n) {
        int res = 1;
        for(int i=0; i<n; i++) {
            res *= x;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int x = sc.nextInt();
        System.out.print("Enter exponent: ");
        int n = sc.nextInt();
        System.out.println(x+" to the Power of " + n + " is " + power(x, n));
        sc.close();

    }
}
