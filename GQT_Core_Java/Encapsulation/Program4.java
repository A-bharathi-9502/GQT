package Encapsulation;
class Dog4{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	void setName(String name) {
		this.name=name;
	}
	void setColor(String color) {
		this.color=color;
	}
	void setBreed(String breed) {
		this.breed=breed;
	}
	void setAge(int age) {
		this.age=age;
	}
	void setCost(int cost) {
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
public class Program4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog4 d1=new Dog4();
		d1.getdata();
		System.out.println("------------------");
		d1.setName("rocky");
		d1.setColor("blue");
		d1.setBreed("GR");
		d1.getdata();

	}

}
