package Arrays;
import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("enter array size ");
        int n=s.nextInt();
        int array[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
            array[i]=s.nextInt();
        }
        Map <Integer,Integer> map=new HashMap<>();
        for(int value: array){
            map.put(value,map.getOrDefault(value,0)+1);
        }
        System.out.println("Frequency of each element is ");
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

	}

}
