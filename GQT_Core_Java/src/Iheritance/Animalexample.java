package Iheritance;
class Animal2{
	void eat() {
		System.out.println("Animal etaing");
	}
	void lives() {
		System.out.println("Animal lives in forest");
	}
}
class Lion extends Animal2{
	void eat() {
		System.out.println("Lion etaing meat");
	}
	void hunting() {
		System.out.println("Lion hunting other animals");
	}
}
class Elephaant extends Animal2{
	void eat() {
		System.out.println("Elephant etaing sugarcane");
	}
	void sleeping() {
		System.out.println("elephant sleeping");
	}
}
class Monkey extends Animal2{
	void eat() {
		System.out.println("monkey eats anything");
	}
	void scratch() {
		System.out.println("Monkey will scratch");
	}
}
class Forest{
	void animalthing(Animal2 a) {
		a.eat();
	}
}
public class Animalexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion l=new Lion();
		Elephaant e=new Elephaant();
		Monkey m=new Monkey();
		Forest f=new Forest();
		f.animalthing(l);
		l.hunting();
		System.out.println("------------------------");
		f.animalthing(m);
		m.scratch();
		System.out.println("------------------------");
		f.animalthing(e);
		e.sleeping();
		

	}

}
