package Arrays;

import java.util.Scanner;

//2d jagged array
public class Arraycode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter class count" );
		int cls=s.nextInt();
		String arr[][]=new String[cls][];

		for(int i=0;i<cls;i++) {
			System.out.println("Enter students count in class "+(i+1) );
			int stu=s.nextInt();
			arr[i]=new String[stu];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("In class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.print("enter name of student "+(j+1)+" : ");
				arr[i][j]=s.next();
			}
		}
		System.out.println("---------------------------------------");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("In class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println(" name of student "+(j+1)+" :"+arr[i][j]);
	
			}
		}



	}

}
