package Arrays;
import java.util.Scanner;

public class Program19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter order of square matrix:");
        int n = sc.nextInt();

        int[][] mat = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        int sum = 0;

        // Upper triangle (including diagonal)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + mat[i][j];
            }
        }

        System.out.println("Sum of upper triangle elements: " + sum);
    }
}
