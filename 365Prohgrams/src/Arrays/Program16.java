package Arrays;
import java.util.*;
import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number of rotations:");
        int r = sc.nextInt();

        System.out.println("Enter direction (L for Left, R for Right):");
        char dir = sc.next().charAt(0);

        r = r % n;   // handle extra rotations

        if (dir == 'L' || dir == 'l') {
            // Left rotation
            for (int i = 0; i < r; i++) {
                int first = arr[0];
                for (int j = 0; j < n - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[n - 1] = first;
            }
        } else if (dir == 'R' || dir == 'r') {
            // Right rotation
            for (int i = 0; i < r; i++) {
                int last = arr[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = last;
            }
        }

        System.out.println("Rotated Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
