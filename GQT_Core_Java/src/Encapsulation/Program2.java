package Encapsulation;
class Dog0{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	void setdata(String name,String color,String breed,int age,int cost) {
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

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog0 d1=new Dog0();
		d1.getdata();
		System.out.println("------------------");
		d1.setdata("Rocky","Blues", "pug", 7,8000);
		d1.getdata();

	}

}
