package org.Cons;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Mapppp {

	public static void main(String[] args) {
		Map<Object, Object> map = new TreeMap<>();
		List list1 = new ArrayList<Integer>();
		List list2 = new ArrayList<String>();

		list1.add(1);
		list2.add("Praveen");
		list1.add(2);
		list2.add("Bala");
		list1.add(3);
		list2.add("kishore");
		list1.add("rk");

		for (int i = 0; i < list1.size(); i++) {
			map.put(list1.get(i), list2.get(i));
		}
		System.out.println(map);

		// map.put("Praveen", "26");
		// map.put("Sudharsan", "36");
		// map.put("Bala", "21");
		// map.put("Jothi", "46");
		// map.put("Sreedharan", "56");
		// map.put("Rk", "100");

	}

}
