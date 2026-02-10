package Arrays;

import java.util.Scanner;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);		
		System.out.println("number of colleges :");
		int c=s.nextInt();
		
		int arr[][][]=new int[c][][];
		for(int i=0;i<c;i++) {
			System.out.println("enter how many classes "+(i+1)+" :");
			int cls=s.nextInt();
			arr[i]=new int[cls][];
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter no of  students "+(j+1)+" ");
				int n=s.nextInt();
				arr[i][j]=new int[n];
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the roll no"+(k+1)+" movie");
					arr[i][j][k]=s.nextInt();
					
				}
					
				}
		}

	}

}
