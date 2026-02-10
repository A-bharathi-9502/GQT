package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer2{
	String name;
	int runs;
	int wickets;
	int matches;
	int catches;
	public Cricketer2(String name, int runs, int wickets, int matches, int catches) {
		super();
		this.name = name;
		this.runs = runs;
		this.wickets = wickets;
		this.matches = matches;
		this.catches = catches;
	}
	
	@Override
	public String toString() {
		return name+"---"+runs+"---"+wickets+"---"+matches+"---"+catches;
	}
}
class Alpha implements Comparator<Cricketer2>{
	@Override
	public int compare(Cricketer2 x,Cricketer2 y) {
		if(y.runs < x.runs) {
			return 1;
		}
		else {
			return -1;
		}
	}
}

public class Launch12 {
	public static void main(String[] args) {
		Cricketer2 c1 = new Cricketer2("Sachin", 18000, 235, 200, 500);
		Cricketer2 c2 = new Cricketer2("Dhoni", 10000, 20, 150, 600);
		Cricketer2 c3 = new Cricketer2("Rohith", 13000, 68, 175, 540);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		Alpha a = new Alpha();
		ArrayList<Cricketer2> al = new ArrayList<Cricketer2>();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al,a);
		System.out.println(al);
	}
}
