import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();
            int[][] arr = new int[rows][columns];
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            int x = sc.nextInt();
            for(int i=0; i<rows; i++){
                for(int j=0; j<columns; j++){
                    if(x==arr[i][j]){
                        System.out.println("x found at location:"+i+" , "+j);
                    }
                }
            }
        }
    }
}
    