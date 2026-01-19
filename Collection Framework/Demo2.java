package com.CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo2 {
	public static void main(String[] args) {
		// LinkedList
		LinkedList ll = new LinkedList();
		ll.add("Daksh");
		ll.add(20);
		ll.add("BCA");
		ll.add('J');
		ll.add(79.6);
		System.out.println(ll);
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		ll.addFirst("Saini");
		ll.addLast("Java");
		
		System.out.println(ll);
	
	}
}
