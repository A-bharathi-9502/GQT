package Iheritance;
class Animal{
	String name;
	String color;
	String country;
	int age;
	void display() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(country);
		System.out.println(age);

	}
	public Animal() {
		name="Animal-1";
		color="black-white";
		country="india";
		age=1;
	}
	public Animal(String name,String color,String country,int age) {
		this.name=name;
		this.color=color;
		this.country=country;
		this.age=age;
		}
}
class Tiger extends Animal{
	public Tiger() {
		super();
	}
}
class Elephant extends Animal{
	public Elephant() {
		super("jamboo","black","india",16);
	}
}
public class InheritanceConstex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tiger t=new Tiger();
		t.display();
		System.out.println("-------------");
		Elephant e=new Elephant();
		e.display();

	}

}
