package basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class P026_Set {
	public static void main(String[] args) {
		Set set =new HashSet();
		set.add(1);
		set.add("java");
		set.add(false);
		set.add('g');
		set.add(45.4);
		set.add(463464665);
		set.add(1);
		set.add("python");
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
