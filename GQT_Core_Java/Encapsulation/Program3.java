package Encapsulation;
class Dog3{
	private String name;
	private String color;
	private String breed;
	private int age;
	private int cost;
	void setName(String name) {
		name=name;
	}
	void setColor(String color) {
		color=color;
	}
	void setBreed(String breed) {
		breed=breed;
	}
	void setAge(int age) {
		age=age;
	}
	void setCost(int cost) {
		cost=cost;
	}
	void getdata() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(cost);
			}
}
public class Program3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog3 d1=new Dog3();
		d1.getdata();
		System.out.println("------------------");
		d1.setName("rocky");
		d1.setColor("blue");
		d1.setBreed("GR");
		d1.getdata();

	}

}
