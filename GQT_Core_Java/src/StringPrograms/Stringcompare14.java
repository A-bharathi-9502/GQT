package StringPrograms;

public class Stringcompare14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SachinRameshTendulkar";
		boolean res=str.isBlank();
		System.out.println(res);
		str="    ";
		System.out.println(str.isBlank());
		System.out.println(str.isEmpty());
		str="";
		System.out.println(str.isEmpty());
		str="SachinRameshTendulkar";
		System.out.println(str.getClass());
		System.out.println(str.hashCode());
		System.out.println(str.indexOf('n'));
		System.out.println(str.indexOf('a',5));
		System.out.println(str.lastIndexOf('a'));

	}

}
