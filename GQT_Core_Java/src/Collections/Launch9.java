package Collections;

import java.util.*;

public class Launch9 {
	public static void main(String args[]) {
		ArrayList<Integer>alist=new ArrayList<Integer>();
		alist.add(100);
		alist.add(50);
		alist.add(50);
		alist.add(60);
		alist.add(30);
		alist.add(60);
		alist.add(10);
		alist.add(46);
		System.out.println(alist);
		System.out.println("-----------using form loop-----------");
		for(int i=0;i<alist.size();i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("-----------using for each loop-----------");
		for(int x:alist) {
			System.out.println(x);
		}
		System.out.println("-----------using iterator-----------");
		Iterator itr=alist.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----------using ListIterator-----------");
		ListIterator ltr=alist.listIterator();
		while(ltr.hasNext()==true) {
			System.out.println(ltr.next());
		}
		System.out.println("-----------reverse----------");
		ListIterator ltr1=alist.listIterator(alist.size());
		while(ltr1.hasPrevious()==true) {
			System.out.println(ltr1.previous());
		}
	}
}
