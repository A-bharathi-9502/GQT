package Arrays;
import java.util.*;
public class Program9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
	        System.out.println("enter array sizes");
	        int n=s.nextInt();
	        int m=s.nextInt();
	        int array1[]=new int[n];
	        int array2[]=new int[m];
	        System.out.println("enter array1 elements ");
	        for(int i=0;i<n;i++){
	            array1[i]=s.nextInt();
	        }
	        System.out.println("enter array2 elements ");
	        for(int i=0;i<m;i++){
	            array2[i]=s.nextInt();
	        }
	        Set <Integer> set1=new HashSet<>();
	        for(int v:array1){
	            set1.add(v);
	        }
	        Set <Integer> intersection=new HashSet<>();
	        for(int v:array2){
	            if(set1.contains(v)){
	                intersection.add(v);
	            }
	        }
	        int array[]=new int[intersection.size()];
	        int i=0;
	        for(int v:intersection){
	            array[i++]=v;
	        }
	        System.out.println("Intersection of arrays :"+ Arrays.toString(array));
	    }
}
