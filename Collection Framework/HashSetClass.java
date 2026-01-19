package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("three");
		hs.add("four");
		hs.add("one"); // duplicate not allowed
		hs.add(null);
		System.out.println(hs);
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
