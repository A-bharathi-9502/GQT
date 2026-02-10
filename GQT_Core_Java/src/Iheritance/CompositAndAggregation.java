package Iheritance;
class OS{
	String name;
	double version;
	public OS(String name,double version) {
		super();
		this.name=name;
		this.version=version;
	}
	public String getName() {
		return name;
	}
	public double getVersion() {
		return version;
	}
	
}
class Charger{
	String company;
	int cost;
	public Charger(String company, int cost) {
		super();
		this.company = company;
		this.cost = cost;
	}
	public String getCompany() {
		return company;
	}
	public int getCost() {
		return cost;
	}
	
}
class Mobile{
	OS os=new OS("xyz",7);
	void hascharger(Charger c) {
		System.out.println(c.getCompany());
		System.out.println(c.getCost());
	}
}
public class CompositAndAggregation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile();
		Charger c=new Charger("Apple",700);
		System.out.println("Os details :\n"+m.os.getName());
		System.out.println(m.os.getVersion());
		System.out.println("Charger details");
		m.hascharger(c);
		System.out.println("--------------------------");
//		m=null;
	//	System.out.println("Os details :\n"+m.os.getName());
		//System.out.println(m.os.getVersion());
		System.out.println("Charger details");
		System.out.println(c.getCompany());
		System.out.println(c.getCost());
		
		
	}

}
