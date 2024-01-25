import java.util.Scanner;
public class AllDivisor {
    // method 1
    static void allDivisor(int n) {
        for(int i=1; i<=n; i++){
            if(n % i == 0) {
                System.out.print(i+" ");
            }
        }
    }

    //  method 2
    // static void allDivisor(int n) {
    //     int i;
    //     for(i=1; i*i<=n; i++) {
    //         if(n%i == 0) {
    //             System.out.print(i+" ");
    //         }
    //     }
    //     for( ; i>=1; i--) {
    //         if(n%i == 0) {
    //             System.out.print((n/i)+" ");
    //         }
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        allDivisor(n);
        sc.close();
    }
}
