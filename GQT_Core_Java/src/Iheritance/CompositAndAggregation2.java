package Iheritance;
class Brain{
	int iq;
	int weight;
	public Brain(int iq, int weight) {
		super();
		this.iq = iq;
		this.weight = weight;
	}
	public int getIq() {
		return iq;
	}
	public int getWeight() {
		return weight;
	}
	
}
class Heart{
	int beats;
	int valves;
	public Heart(int beats, int valves) {
		super();
		this.beats = beats;
		this.valves = valves;
	}
	public int getBeats() {
		return beats;
	}
	public int getValves() {
		return valves;
	}
	
}
class Human{
	Brain b=new Brain(5,4);
	Heart h=new Heart(72,4);
	
}
class Mobile1{
	int cost;
	String company;
	public Mobile1(int cost, String company) {
		super();
		this.cost = cost;
		this.company = company;
	}
	public int getCost() {
		return cost;
	}
	public String getCompany() {
		return company;
	}
	
}
class Book{
	String name;
	String author;
	public Book(String name, String author) {
		super();
		this.name = name;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}
class Student extends Human{
	void hasmobile(Mobile1 m) {
		System.out.println(m.getCost());
		System.out.println(m.getCompany());
	}
	void hasBook(Book b) {
		System.out.println(b.getAuthor());
		System.out.println(b.getName());
	}
}
public class CompositAndAggregation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		Book b=new Book("roa","me");
		Mobile1 m=new Mobile1(2000,"vivo");
		System.out.println("hear6t details ");
		System.out.println("beats "+s.h.getBeats());
		System.out.println("valves "+s.h.getValves());
		System.out.println("Brain details");
		System.out.println("iq "+s.b.getIq());
		System.out.println("wigt "+s.b.getWeight());
		System.out.println("book datils");
		s.hasBook(b);
		System.out.println("mobile dtails");
		s.hasmobile(m);
		

	}

}
