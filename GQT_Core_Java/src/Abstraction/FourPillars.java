package Abstraction;
import java.util.*;
abstract class Shape{
	double area;
	static Scanner s=new Scanner(System.in);
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
class Circle extends Shape{
	double r;
	double pi=3.1147;
	void collect() {
		System.out.println("enter radius");
		r=s.nextDouble();
		
	}
	void calculate() {
		area=r*pi*r;
	}
}
class Square extends Shape{
	double side;
	void collect() {
		System.out.println("enter side");
		side=s.nextDouble();
		
	}
	void calculate() {
		area=side*side;
	}
}
class Rectangle extends Shape{
	
	double l,b;
	void collect() {
		System.out.println("enter lenght");
		l=s.nextDouble();
		System.out.println("enter breadth");
        b=s.nextDouble();
		
	}
	void calculate() {
		area=l*b;
	}
}
class Geometry{
	void useshape(Shape s) {
		s.collect();
		s.calculate();
		s.display();
	}
}
public class FourPillars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle();
		Square s=new Square();
		Rectangle r=new Rectangle();
		Geometry g=new Geometry();
		g.useshape(c);
		System.out.println("--------------------");
		g.useshape(s);
		System.out.println("--------------------");
		g.useshape(r);
		System.out.println("--------------------");

	}

}
