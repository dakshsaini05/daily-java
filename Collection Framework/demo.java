package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Vector;

public class demo {
	public static void main(String[] args) {
		
		/* VECTOR
		Vector v = new Vector<>();
		v.add(100);
		v.add(45.7);
		v.add(true);
		v.add('R');
		v.add("Daksh");
		v.add(new demo());
		System.out.println(v);
		// Iterate
		Enumeration enm = v.elements();
		while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
		}
		*/
		
//		Properties p = new Properties();
//		p.put("English", 89);	
//		p.put("Math", 65);
//		p.put("Hindi", 88);
//		p.put("Science", 90);
//		System.out.println(p);
//		// Iterate
//		Enumeration em = p.propertyNames();
//		while(em.hasMoreElements()) {
//			String keys = (String)em.nextElement();
//			String values = p.getProperty(keys);
//			System.out.println(keys+" "+values);
//		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1 ; i<=10 ; i++) {
			al.add(i);
		}
		System.out.println(al);
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=11 ; i<=20 ; i++) {
			al2.add(i);
		}
		
		Iterator<Integer> itr = al.iterator();
//		while(itr.hasNext()) {
//			Integer o = itr.next();
//			if(o%2 == 1) {
//				itr.remove();
//			} else {
//				System.out.println(o);
//			}
//			
//		}
		
//		while(itr.hasNext()) {
//			Integer o = itr.next();
//			if(o == 5) {
//				itr.remove();
//			} else {
//				System.out.println(o);
//			}
//		}
		
		ListIterator<Integer> li = al.listIterator();
		// forward moving
		while(li.hasNext()) {
			int o = li.next();
			System.out.println(o);
		}
		
		System.out.println("==================");
		
		// backward moving
		while(li.hasPrevious()) {
			int o = li.previous();
			System.out.println(o);
		}
		
		System.out.println("==================");
		
		System.out.println("indexOf() method: "+al.indexOf(8)); //Tells the index of specified value
		System.out.println("contains() method: "+al.contains(11)); //Returns boolean value for rather the element specified is present or not
		System.out.println("clone() method: "+al.clone()); //Returns a copy of the element
		System.out.println(al);
		System.out.println(al2);
		System.out.println("Adding two collections: "+al.addAll(5, al2));
		System.out.println("Addition of two collections: "+al);
		System.out.println(al.containsAll(al2));
		System.out.println(al.get(4));
		
		Object[] o1 = al.toArray();
		for(Object ele:o1) {
			System.out.println(ele);
		}
		
		LinkedList ll = new LinkedList();
		
		ll.add(15);
		ll.add(20);
		ll.add(44);
		ll.add(67);
		ll.add(99);
		System.out.println(ll);
		
		
	}
}
