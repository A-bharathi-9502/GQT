package Iheritance;
class Airport{
	void permit(Plane1 ref) {
		ref.fly();
		ref.land();
		ref.takeoff();
	}
}
public class Condensed{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cargo1 c=new Cargo1();
		Fighter1 f=new Fighter1();
		Passenger1 p=new Passenger1();
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
