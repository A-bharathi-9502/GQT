package constructor;
class Tiger{
	private String name;
	private String color;
	private String country;
	private int age;
	public Tiger() {
		super();
		this.name="Ramu";
		this.color="Yellow";
		this.country="Japan";
		this.age=7;
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);
	}
	public Tiger(String name) {
		this();
		this.name=name;
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);
	}
	public Tiger(String name,String color) {
		this("Bhageera");
		this.name=name;
		this.color=color;
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);
	}
	public Tiger(String name,String color,String country) {
		this("Sugreeva","Black");
		this.name=name;
		this.color=color;
		this.country=country;
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);
	}
	public Tiger(String name,String color,String country,int age) {
		this("Bharatha","White","korea");
		this.name=name;
		this.color=color;
		this.country=country;
		this.age=age;
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);
	}
	
}
public class Constructorexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger("laxman","orange","india",17);

	}

}
