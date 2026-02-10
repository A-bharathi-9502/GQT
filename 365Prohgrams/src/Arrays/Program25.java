package Arrays;
import java.util.Scanner;

public class Program25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0, negative = 0, zero = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println("Positive numbers count: " + positive);
        System.out.println("Negative numbers count: " + negative);
        System.out.println("Zero count: " + zero);
    }
}
