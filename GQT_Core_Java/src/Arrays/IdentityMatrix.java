package Arrays;
import java.util.*;

public class IdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the row size");
		int r=s.nextInt();
		System.out.println("Enter the column size");
		int c=s.nextInt();
		int arr[][]=new int[r][c];
		System.out.println("enter elements");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=s.nextInt();
			}
			System.out.println();
		}
		boolean isidentical=false;
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				if(i==j&&!(arr[i][j]==1)) {
					System.out.println("matrix is not identical1");
					isidentical=false;
					System.exit(0);
				}
				else {
					if(arr[i][j]==0) {
						isidentical=true;
					}
					else {
						System.out.println("matrix is not identical2");
						isidentical=false;
						System.exit(0);
						
					}
				}
			}
		}
		if(isidentical) {
			System.out.println("Matrix is identical3");
		}
		

	}

}
