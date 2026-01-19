package com.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TressSetClass {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(50);
		ts.add(100);
		ts.add(150);
		ts.add(75);
		ts.add(28);
		ts.add(175);
		ts.add(125);
//		ts.add(null); gives NullPointerException
		
		System.out.println(ts);
		
		Iterator itr = ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("Smallest element: "+ts.first());
		System.out.println("Largest element: "+ts.last());
		
		
//		TreeSet ts2 = new TreeSet(); // will throw ClassCastException if elements are hetrogenous
//		ts2.add("Daksh");
//		ts2.add(20);
//		ts2.add('J');
//		ts2.add(79.6);
//		System.out.println(ts2);
		
		
		
	}
}
