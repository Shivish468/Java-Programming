import java.util.Scanner;

public class Prime {
    // for small n it's okay but not good tc for long n
//     static boolean isPrime(int n) {
//         if (n <= 1) return false;
//         for (int i=2; i*i<=n; i++) {
//             if (n%i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();
//         System.out.println((isPrime(n)) ? "Yes, It's a prime number" : "No, It's not a prime number");
//         sc.close();
//     }
// for long n with optimized method
    static boolean isPrime(long n) {
        if (n <= 1) return false;
        if (n==2 || n==3) return true;
        if (n%2 == 0 || n%3 == 0) {
            return false;
        }
        for (int i=5; i*i<=n; i+=6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (-1 to quit): ");
        while (true) {
            long n = sc.nextLong();
            if (n == -1) break;
            System.out.println((isPrime(n)) ? "Yes, It's a prime number" : "Not a prime number! Enter again: ");
        }
        sc.close();
    }
}
