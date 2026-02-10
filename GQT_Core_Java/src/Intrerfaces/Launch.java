package Intrerfaces;
interface Calculator{
	public static final int a=200;
	public abstract void add();
	default void sub() {
		System.out.println("sub method");
	}
	static void mul() {
		System.out.println("mul method");
	}
}
class Childcalcy1 implements Calculator{
	public void add() {
		System.out.println("Add from childcalcy1");
	}
}
class Childcalcy2 implements Calculator{
	public void add() {
		System.out.println("Add from childcalcy2");
	}
}
class Childcalcy3 implements Calculator{
	public void add() {
		System.out.println("Add from childcalcy3");
	}
}
//class Test{
	//void add();
	//void sub();
	//void mul();
	//void div();
//}
interface Calculator1{
	void add();
	void sub();
	void mul();
	void div(); 
}
interface Calculator2{
	void add1();
	void sub2();
	void mul3();
	void div4(); 
}
class Child4 implements Calculator1,Calculator2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Add from calculator1");

		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub from calculator1");

	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul from calculator1");

	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div from calculator1");

	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		System.out.println("Add from calculator2");

	}

	@Override
	public void sub2() {
		// TODO Auto-generated method stub
		System.out.println("sub from calculator2");

	}

	@Override
	public void mul3() {
		// TODO Auto-generated method stub
		System.out.println("mul from calculator2");
	
	}

	@Override
	public void div4() {
		// TODO Auto-generated method stub
		System.out.println("div from calculator2");

	}
	
	
}
interface Calc3{
	void add();
	void sub();
}
//interface Calc4 implements Calc3{
//	void mul();
//}
interface Calc5 extends Calc3{
	void add2();
	
}

interface Calc6 {

}
interface Calc8{
	void add();
}
interface Calc9{
	public static final int  a=200;
	public abstract void add2();
	public static void add3() {
		System.out.println("hi from static add from calc9");
	}
	
}
@FunctionalInterface
interface Calc10{
	public static final int  a=200;
	public abstract void add2();
	public static void add3() {
		System.out.println("hi from static add from calc9");
	}
	
}

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculator1 c1=new Calculator();
	Calculator1 c2=new Calculator1() {
		public void add() {
			System.out.println("Add from childcalcy1");
		}
		public void sub() {
			System.out.println("sub method");
		}
	  public  void mul() {
			System.out.println("mul method");
		}
	  public void div() {
			// TODO Auto-generated method stub
			System.out.println("div from calculator1");

	  }
	};
	System.out.println(c2);


	}

}
