package Arrays;
import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int r = sc.nextInt();

        System.out.println("Enter number of columns:");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Row-wise sum
        for (int i = 0; i < r; i++) {
            int rowSum = 0;
            for (int j = 0; j < c; j++) {
                rowSum += mat[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + rowSum);
        }

        // Column-wise sum
        for (int j = 0; j < c; j++) {
            int colSum = 0;
            for (int i = 0; i < r; i++) {
                colSum += mat[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + colSum);
        }
    }
}
