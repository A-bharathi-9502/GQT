package Arrays;
import java.util.*;
/* language type   moives
     0        0      2
*/
public class Movies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int prev=300;
		int inv=700;
		int profit=0;		
		System.out.println("number of languages :");
		int l=s.nextInt();
		int collection[]=new int[l];
		int arr[][][]=new int[l][][];
		for(int i=0;i<l;i++) {
			int p1=0;
			System.out.println("enter how many types in language "+(i+1)+" :");
			int t=s.nextInt();
			arr[i]=new int[t][];
			
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter no of  movies of type "+(j+1)+" ");
				int n=s.nextInt();
				arr[i][j]=new int[n];
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("enter the collection of "+(k+1)+" movie");
					arr[i][j][k]=s.nextInt();
					profit+=arr[i][j][k];
					p1+=arr[i][j][k];
					
				}
					
				}
			collection[i]=p1;
			System.out.println("collection of language "+(i+1)+" is "+p1);
			System.out.println("----------------------------------------");
			}
		System.out.println("Total income is "+profit);
		
		System.out.println("Comparing income and revenue");
		if(profit>inv) {
			System.out.println("got profit of "+(profit-inv));
		}
		else {
			System.out.println("Loss of "+(inv-profit));
		}
		System.out.println("Comparing with prev year profit ");
		if(profit>prev) {
			System.out.println("Got more than previous year");
		}
		else {
			System.out.println("Got less than previous year");
		}
		System.out.println("collection from each languge is ");
		for(int i=0;i<l;i++) {
			System.out.println("collection of language "+(i+1)+" : "+collection[i]);
		}

	}

}
