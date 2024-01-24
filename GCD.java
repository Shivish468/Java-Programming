import java.util.Scanner;
public class GCD {
    // public static int gcd(int a, int b) {
    //     int n = (a > b) ? a : b;
    //     int max=0;
    //     for(int i=2; i<=n; i++){
    //         if(a%i==0 && b%i==0){
    //             if(max<i){
    //                 max=i;
    //             }
    //         }
    //     }
    //     return max;
    // }
    // public static void main(String[] args) {
    //     System.out.println(gcd(8,12));
    // }
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a is: ");
        int a = sc.nextInt();
        System.out.print("b is: ");
        int b = sc.nextInt();
        System.out.println("GCD of " +a+  " and " +b+ " is " +gcd(a, b));
        sc.close();
    }
}
