package org.hi;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Challenge5 {

	public static void main(String[] args) {
		List<Integer> l = new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(100);
		l.add(500);
		l.add(200);
		System.out.println("The List is :" + l);
		Set<Integer> s = new TreeSet<Integer>();
		System.out.println("The Treeset is:" + s.addAll(l));

		for (Integer integer : s) {

			System.out.println(integer);
		}
	}
}