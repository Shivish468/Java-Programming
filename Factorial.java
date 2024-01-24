import java.util.Scanner;
public class Factorial {
//     static int fact(int n){
//         // method 1 Time Complexity O(n)
//         // if (n == 0) return 1;
//         // return n * fact(n-1);
//         // method 2 TC O(1)
//         int res = 1;
//         if (n == 0) return 1;
//         for (int i=2 ;i<=n ;i++) {
//             res = res*i;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println("Factorial of "+n+ " is: " + fact(n));
//         sc.close();
//     }
    static int trailingZero(int n) {
        int count = 0;
        for(int i=5; i*i<=n; i=i*5) {
            count += (n/i);
        }
        return count;
       }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The number of trailing zeroes in the factorial of "+n+ " is: " + trailingZero(n));
        sc.close();
    }
}
