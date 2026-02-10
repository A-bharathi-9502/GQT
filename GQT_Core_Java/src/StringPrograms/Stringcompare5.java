package StringPrograms;

public class Stringcompare5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("RAMA");
		String str2=new String("SITA");
		String str3=new String("RAMA");
		String str4=new String("rama");
		if(str1==str2) {
			System.out.println("references are equal ");
		}
		else {
			System.out.println("references are not equal");
		}
		if(str1==str3) {
			System.out.println("references are equal ");
		}
		else {
			System.out.println("references are not equal");
		}
		if(str1==str4) {
			System.out.println("references are equal ");
		}
		else {
			System.out.println("references are not equal");
		}


	}

}
