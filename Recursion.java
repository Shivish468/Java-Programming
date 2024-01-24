public class Recursion {
    public static void towerOfHanoi(int n, String beg, String aux, String end){
        if(n==1){
            System.out.println(beg+" to "+end);
            return;
        }

        towerOfHanoi(n-1,beg,end,aux);
        System.out.println(beg+" to "+end);
        towerOfHanoi(n-1,aux,beg,end);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n,"A","B","C");
    }
}
