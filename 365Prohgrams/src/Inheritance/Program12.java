package Inheritance;

public class Program12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple a = new Apple();
	     a.name = "Apple";      
	     a.color = "Red";    
	     a.taste = "Sweet";    
	     Banana b = new Banana();
	     b.name = "Banana";    
	     b.color = "Yellow";    
	     b.size = "Large"; 
	     System.out.println("Apple Details:");
	     System.out.println(a.name + " " + a.color + " " + a.taste);
	     System.out.println();
	     System.out.println("Banana Details:");
	     System.out.println(b.name + " " + b.color + " " + b.size);


	}

}
