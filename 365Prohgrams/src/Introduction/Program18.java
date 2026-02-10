package Introduction;
import java.util.*;
public class Program18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = 1;
            for (int space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }

	}

}
