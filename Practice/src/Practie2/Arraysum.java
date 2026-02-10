package Practie2;
import java.util.*;

public class Arraysum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter array size");
        int n = s.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter k value");
        int k = s.nextInt();

        int start = 0, sum = 0;
        boolean found = false;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                System.out.println("YES");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("NO");
        }
    }
}
