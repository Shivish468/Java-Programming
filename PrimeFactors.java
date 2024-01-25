import java.util.Scanner;

public class PrimeFactors {
    // method 1
    // static boolean isPrime(int n) {
    //     if (n <= 1) return false;
    //     for (int i=2; i*i<=n; i++) {
    //         if (n%i == 0) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // static void primeFactors(int n) {
        // method 1
        // for (int i=2; i<n; i++){
        //     if (isPrime(i)) {
        //         int x = i;
        //         while (n % x == 0){
        //             System.out.print(i+ " ");
        //             x = x * i;
        //         }
        //     }
        // }
    // }

    // method 2
    // static void primeFactors(int n) {
    //     if (n <= 1) return;
    //     for (int i=2; i*i<=n; i++) {
    //         while (n%i == 0 ) {
    //             System.out.print(i+ " ");
    //             n = n / i;
    //         }
    //     }
    //     if (n > 1) {
    //         System.out.println(n);
    //     }
    // }

    // method 3
    static void primeFactors(int n) {
        if (n <= 1) return;
        while (n % 2 == 0) {
            System.out.print(2 +" ");
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.print(3 +" ");
            n /= 3;
        }
        for (int i=5; i*i<=n; i+=6) {
            while (n % i == 0) {
                System.out.print(i +" ");
                n /= i;
            }
            while (n % (i+2) == 0) {
                System.out.print((i+2) +" ");
                n /= (i+2);
            }
        }
        if (n > 3) {
            System.out.println(3);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        primeFactors(n);
        sc.close();
    }
}
