public class GCD {
    public static int gcd(int a, int b) {
        int n = (a > b) ? a : b;
        int max=0;
        for(int i=2; i<=n; i++){
            if(a%i==0 && b%i==0){
                if(max<i){
                    max=i;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(gcd(8,12));
    }
}
