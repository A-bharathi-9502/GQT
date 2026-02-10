package Arrays;
import java.util.*;
public class Arraycode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter class count" );
		int cls=s.nextInt();
		System.out.println("Enter students count" );
		int stu=s.nextInt();
		String arr[][]=new String[cls][stu];
		for(int i=0;i<cls;i++)
		{
			System.out.println("In class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.print("enter name of student "+(j+1)+" : ");
				arr[i][j]=s.next();
			}
		}
		System.out.println("---------------------------------------");
		for(int i=0;i<cls;i++)
		{
			System.out.println("Ins class "+(i+1));
			for(int j=0;j<stu;j++) {
				System.out.println(" name of student "+(j+1)+" :"+arr[i][j]);
	
			}
		}


	}

}
