package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P023_List {
	public static void main(String[] args) {
		List list =new ArrayList();
		list.add(1);
		list.add("java");
		list.add(false);
		list.add('f');
		list.add(345.3);
		list.add(34546565);
		list.add(1);
		list.add(34253);
		System.out.println(list);
		list.remove(7);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
