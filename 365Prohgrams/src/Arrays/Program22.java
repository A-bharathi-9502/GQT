package Arrays;

import java.util.Scanner;

public class Program22 {
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
        }

        boolean isSymmetric = true;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        if (isSymmetric) {
            System.out.println("Matrix is Symmetric");
        } else {
            System.out.println("Matrix is NOT Symmetric");
        }
    }
}
