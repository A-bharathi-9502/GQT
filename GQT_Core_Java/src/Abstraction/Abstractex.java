package Abstraction;


abstract class Plane{
	abstract void takeoff();
	abstract void fly() ;
	void land() {
		System.out.println("Plne is landing");
	}
}
abstract class Cargo2 extends Plane{
	// takeoff()
	//fly()
	void carrygoods() {
		System.out.println("cargo plane caries goods");
	}
}
class Cargo extends Plane{
	void takeoff() {
		System.out.println("cargo plane is took off");
	}
	void fly() {
		System.out.println("cargo plane flies at lower");
	}
	void carrygoods() {
		System.out.println("cargo plane caries goods");
	}
}
class Airport{
	void permit(Plane ref) {
		ref.fly();
		ref.land();
		ref.takeoff();
	}
}

class Passenger extends Plane{
	void takeoff() {
		System.out.println("passebger plane is took off");
	}
	void fly() {
		System.out.println("passenger plane fries at midium");
	}
	void carrypassengers() {
		System.out.println("passenger plane carries passengers");
	}
}
class Fighter extends Plane{
	void takeoff() {
		System.out.println("fighter plane is took off");
	}
	void fly() {
		System.out.println("Fighter plane fries at higher");
	}
	void carryweapons() {
		System.out.println("Fighter plane caries waepons");
	}
}
public class Abstractex {
			public static void main(String[] args) {
			// TODO Auto-generated method stub
			Plane ref=new Plane() {
				void takeoff() {
					System.out.println("Plane took off");
				}
				void fly() {
					System.out.println("Plane flying");
				}
			};
			ref.takeoff();
			ref.fly();
			ref.land();
			System.out.println("----------------");
			Cargo c=new Cargo();
			Fighter f=new Fighter();
			Passenger p=new Passenger();
			Airport a=new Airport();
			a.permit(c);
			c.carrygoods();
			System.out.println("-------------------------");
			a.permit(p);
			p.carrypassengers();
			System.out.println("-------------------------");
			a.permit(f);
			f.carryweapons();
			System.out.println("-------------------------");



		}

}
