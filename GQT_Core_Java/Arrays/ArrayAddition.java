package Arrays;
import java.util.*;
public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array1 size no of rows and columns ");
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		System.out.println("enter array1 elemnts ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter array 2 elemnts ");
		int arr2[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr2[i][j]=s.nextInt();
			}
			System.out.println();
		}
		int [][]result=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				result[i][j]=arr[i][j]+arr2[i][j];
			}
		}
		System.out.println("resultant matrix is ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}

	}

}
