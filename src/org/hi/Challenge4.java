package org.hi;

import java.util.LinkedList;
import java.util.List;

public class Challenge4 {
	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		for (Integer integer : l) {
			System.out.println(integer);
		}

	}

}
