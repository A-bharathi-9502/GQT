package StringPrograms;

public class Stringcompare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="RAMA";
		String str2="SITA";
		String str3="RAMA";
		String str4="rama";
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
