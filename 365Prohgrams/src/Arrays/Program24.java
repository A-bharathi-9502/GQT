package Arrays;
import java.util.Scanner;

public class Program24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        // Sorting array (simple bubble sort)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        if (k > 0 && k <= n) {
            System.out.println(k + "th Smallest element: " + arr[k - 1]);
            System.out.println(k + "th Largest element: " + arr[n - k]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
