package Iheritance;
class Plane{
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
class Cargo extends Plane{
	void fly() {
		System.out.println("cargo plane flies at lower");
	}
	void carrygoods() {
		System.out.println("cargo plane caries goods");
	}
}
class Passenger extends Plane{
	void fly() {
		System.out.println("passenger plane fries at midium");
	}
	void carrypassengers() {
		System.out.println("passenger plane carries passengers");
	}
}
class Fighter extends Plane{
	void fly() {
		System.out.println("Fighter plane fries at higher");
	}
	void carryweapons() {
		System.out.println("Fighter plane caries waepons");
	}
}
public class InheritanceMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo c=new Cargo();
		Fighter f=new Fighter();
		Passenger p=new Passenger();
		c.takeoff();
		c.fly();
		c.carrygoods();
		c.land();
		System.out.println("-------------------------");
		p.takeoff();
		p.fly();
		p.carrypassengers();
		p.land();
		System.out.println("-------------------------");
		f.takeoff();
		f.fly();
		f.carryweapons();
		f.land();
		System.out.println("-------------------------");



	}

}
