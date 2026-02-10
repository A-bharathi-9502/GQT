package Collections;
import java.util.*;
public class Launch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> tree=new TreeSet<Integer>();
		tree.add(30);
		tree.add(10);
		tree.add(60);
		tree.add(70);
		tree.add(890);
		System.out.println("intial tree set is "+ tree);
		System.out.println("ceiling()--> "+tree.ceiling(50)+"\ntree is "+ tree);
		System.out.println("first()--> "+tree.first());
		System.out.println("remove()-> "+tree.remove(10));
		System.out.println("after remove "+tree);
		System.out.println("size "+tree.size());
		TreeSet<Integer>  tree1=(TreeSet<Integer>)tree.clone();
		System.out.println("intial tree2 set is "+ tree1);
		tree1.add(80);
		System.out.println(tree1);
		int res=tree.first();
		System.out.println(res);
		System.out.println("getfirst()->"+tree.getFirst());
		System.out.println("getfirst()->"+tree.getLast());
		System.out.println("higher()-> "+tree.higher(8));
		System.out.println("lower()-> "+tree.lower(90));
		System.out.println("pollFirst()-> "+tree.pollFirst());
		System.out.println("polllast()-> "+tree.pollLast());
		System.out.println("afetr poll "+tree);
		System.out.println(tree);

	}

}
