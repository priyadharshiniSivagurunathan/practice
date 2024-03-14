package org.hi;

import java.util.Map;
import java.util.TreeMap;

public class Challenge6 {

	public static void main(String[] args) {
		Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
		m.put(10, 10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		System.out.println("The Treemap is :" + m);
		for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println(key);
			System.out.println(value);
		}
	}
}
