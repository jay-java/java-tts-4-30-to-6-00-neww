package basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P028_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");//entry
		map.put(2, "c++");
		map.put("java",3);
		map.put(false,"python");
		map.put(12, "php");
		map.put(null, ".net");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry = (Entry)itr.next();
				System.out.print("key : "+entry.getKey());
				System.out.println(" value : "+entry.getValue());
		}
	}
}
