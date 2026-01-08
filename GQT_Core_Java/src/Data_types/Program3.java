package Data_types;

public class Program3 {
	  public static void main(String arg[]){
	        System.out.println("Byte Warapper Class");
	        byte b=125;
	        Byte b1=new Byte(b);
	        System.out.println(b1.getClass());
	        System.out.println("The value in Byte = "+b1);
	        short s=12345;
	        Short s1=new Short(s);
	        System.out.println(s1.getClass());
	        System.out.println("The value in Short = "+s1);
	        int i=12567;
	        Integer i1=new Integer(i);
	        System.out.println(i1.getClass());
	        System.out.println("The value in Integer = "+i1);
	    
	        long l=1256789;
	        Long l1=new Long(l);
	        System.out.println(l1.getClass());
	        System.out.println("The value in Long = "+l1);
	        char c='e';
	        Character c1=new Character(c);
	        System.out.println(c1.getClass());
	        System.out.println("The Value in Character = "+c1);
	        String st="GQT";
	        String st1=new  String(st);
	        System.out.println(st1.getClass());
	        System.out.println("The Value in Character = "+c1);
	           }

}
