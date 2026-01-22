package com.collectionframeworkbehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo1 {
	public static void main(String[] args) {
		// ArrayList object creation (Hetrogeneous/Non-generic)
		ArrayList al = new ArrayList();
		
		//default size
		System.out.println(al.size());
		
		// ArrayList value insertion
		al.add(10);
		al.add(55.45);
		al.add("Daksh");
		al.add('R');
		al.add(true);
		
		// ArrayList object creation (Homogeneous/Non-generic)
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(10);
		al2.add(20);
		al2.add(145);
		al2.add(170);
		al2.add(null);
		al2.add(170);
		
		// Printing the list
		System.out.println(al);
		System.out.println(al2);
		
		// Iteration using forEach
		for(Object aa : al) {
			System.out.println(aa);
		}
		
		// Iteration using Iterator interface
		Iterator<Integer> itr = al2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// making arraylist synchronized
		Collections.synchronizedList(al2);
		
		
	}
}
