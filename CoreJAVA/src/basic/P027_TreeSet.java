package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P027_TreeSet {
	public static void main(String[] args) {
		Set set =new TreeSet();//sorted set
		set.add(1);
		set.add(-987);
		set.add(12345);
		set.add(120);
		set.add(45);
		set.add(0);
		set.add(12);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
