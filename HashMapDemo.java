package com.postingandpushing;

import java.util.HashSet;
import java.util.Iterator;

public class HashMapDemo {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();

		set.add("Red");
		set.add("Green");
		set.add("Red"); // duplicate, ignored
		set.add(null);
		set.add("Blue");
		set.add("Pink");
		set.add(null); // only one null allowed

		System.out.println(set); // order not guaranteed
		
		// Traversing Elements
		System.out.println("Traversing over elements: ");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String i = itr.next();
			System.out.println(i);
		}
	}
}
