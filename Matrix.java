
import java.util.*;

public class Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        System.out.println("Enter the Matrix ");
        int[][] Matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < n; i++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
