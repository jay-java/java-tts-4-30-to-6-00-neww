package basic;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class P024_Vector {
	public static void main(String[] args) {
		Vector list =new Vector();
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
		list.add("python");
		System.out.println(list);
		Enumeration em = list.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
