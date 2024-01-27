import java.util.Scanner;

public class Power {
    // method 1
    // static int power(int x, int n) {
    //     int res = 1;
    //     for(int i=0; i<n; i++) {
    //         res *= x;
    //     }
    //     return res;
    // }

    // method 2
    static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        else{
            int temp = power(x, n/2);
            temp = temp*temp;
            if(n % 2 == 0) {
                return temp;
            }
            else {
                return temp*x;
            }
        }
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
