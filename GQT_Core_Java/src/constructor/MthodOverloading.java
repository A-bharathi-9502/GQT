package constructor;
class Calculator{
	int add(int a,int b) {
		return a+b;
	}
	float add(float a,float b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	double add(double a,int b) {
		return a+b;
	}
	double add(int a,double b) {
		return a+b;
	}
}
public class MthodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator();
		int a=10,b=20;
		float m=23.5f,n=34.5f;
		double p=345.678,q=987.6654;
		int res=c.add(a, b);
		System.out.println(res);
		System.out.println("------------");
		float res1=c.add(m, n);
		System.out.println(res1);
		System.out.println("------------");
		double res2=c.add(a, b);
		System.out.println(res2);
		System.out.println("------------");
		float res3=c.add(m, a);
		System.out.println(res3);
		System.out.println("------------");
		float res4=c.add(b, n);
		System.out.println(res4);
		System.out.println("------------");
		double res5=c.add(p, a);
		System.out.println(res5);
		System.out.println("------------");
		double res6=c.add(q, b);
		System.out.println(res3);
		System.out.println("------------");






		

	}

}
