package StringPrograms;

public class Stringcompare4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("RAMA");
		String str2=new String("SITA");
		String str3=new String("RAMA");
		String str4=new String("rama");
		if(str1.equals(str2)==true) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1.equals(str3)==true) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1.equals(str4)==true) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}



	}

}
