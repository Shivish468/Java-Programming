import java.util.*;
public class Function{
    /*public static void printfactorial(int n){
        int factorial=1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printfactorial(n);
    }*/
    /*public static int findgcd(int a, int b) {
        int gcd=1;
        for(int i=1; i<a && i<b; i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(findgcd(a,b));
        }*/
        static int a = 0,b = 1,c = 0;
        public static void findfibo(int n) {
            
            for(int i=2; i<n; i++){
                c = a+b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }
            
        }
        public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.nextInt();
                System.out.print(a+ " " +b);
                findfibo(n);
            }
            
        }
}