package StringPrograms;

public class Stringcompare9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("RAMA");
		String str2=new String("SITA");
		String str3=new String("RAMA");
		String str4=new String("rama");
		String str5=new String("Rama");
		if(str1.compareTo(str2)==0) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1.compareTo(str3)==0) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1.compareTo(str4)==0) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}
		if(str1.compareTo(str5)==0) {
			System.out.println("Stirngs are equal ");
		}
		else {
			System.out.println("Strings are not equal");
		}


	}

}
