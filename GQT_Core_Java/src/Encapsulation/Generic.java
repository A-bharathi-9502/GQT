package Encapsulation;
class Dog{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	void setdata(String n,String c,String b,int a,int d) {
		this.name=name;
		this.color=color;
		this.breed=breed;
		this.age=age;
		this.cost=cost;
	}
	void getdata() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);		
	}

}
public class Generic {
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.getdata();
		System.out.println("------------------");
		d1.setdata("Rocky","Blues", "pug", 7,8000);
		d1.getdata();

	}

}
