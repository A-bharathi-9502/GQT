package Arrays;
import java.util.Scanner;

public class Program23 {
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
        boolean found = false;
        for (int i = 0; i < r; i++) {
            int min = mat[i][0];
            int colIndex = 0;
            for (int j = 1; j < c; j++) {
                if (mat[i][j] < min) {
                    min = mat[i][j];
                    colIndex = j;
                }
            }
            int k;
            for (k = 0; k < r; k++) {
                if (mat[k][colIndex] > min) {
                    break;
                }
            }
            if (k == r) {
                System.out.println("Saddle Point found: " + min);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No Saddle Point found");
        }
    }
}
