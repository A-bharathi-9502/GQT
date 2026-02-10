package Iheritance;
class Plane1{
	void takeoff() {
		System.out.println("Plane took off");
	}
	void fly() {
		System.out.println("Plane is flying");
	}
	void land() {
		System.out.println("Plne is landing");
	}
}
class Cargo1 extends Plane1{
	void fly() {
		System.out.println("cargo plane flies at lower");
	}
	void carrygoods() {
		System.out.println("cargo plane caries goods");
	}
}
class Passenger1 extends Plane1{
	void fly() {
		System.out.println("passenger plane fries at midium");
	}
	void carrypassengers() {
		System.out.println("passenger plane carries passengers");
	}
}
class Fighter1 extends Plane1{
	void fly() {
		System.out.println("Fighter plane fries at higher");
	}
	void carryweapons() {
		System.out.println("Fighter plane caries waepons");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Plane1 ref;
		Cargo1 c=new Cargo1();
		Fighter1 f=new Fighter1();
		Passenger1 p=new Passenger1();
		ref=c;
		ref.takeoff();
		ref.fly();
		c.carrygoods();
		ref.land();
		System.out.println("-------------------------");
		ref=p;
		ref.takeoff();
		ref.fly();
		p.carrypassengers();
		ref.land();
		System.out.println("-------------------------");
		ref=f;
		ref.takeoff();
		f.fly();
		f.carryweapons();
		ref.land();
		System.out.println("-------------------------");



	}

}
