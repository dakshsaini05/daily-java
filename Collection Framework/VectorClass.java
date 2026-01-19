package com.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

// Legacy Classes
/*
 * Vector
 * Dictionary
 * hashtable
 * stack
 * properties 
 */
class Hello {

}

public class VectorClass {
	public static void main(String[] args) {
		Vector v1 = new Vector(); // Non generic vector
		System.out.println("Before adding any elements: ");
		System.out.println("Size: "+v1.size()); // number of components
		System.out.println("Capacity: "+v1.capacity()); // current capacity
		v1.addElement(12);
		v1.addElement(12.4);
		v1.addElement(true);
		v1.addElement("StringS");
		v1.addElement(new Hello());
		System.out.println("After adding five elements");
		System.out.println("Size: "+v1.size());
		System.out.println("Capacity : "+v1.capacity());
		System.out.println("===========================================");
		v1.add("aa");
		v1.add("bb");
		v1.add("cc");
		v1.add("dd");
		v1.add("ee");
		v1.add("bb");
		System.out.println("After adding 6 more elements: ");
		System.out.println("Size: "+v1.size());
		System.out.println("Capacity: "+v1.capacity());
		System.out.println("===========================================");
		
		Enumeration<String> enm = v1.elements();
		while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
		}
		
		System.out.println(v1.get(0));
		System.out.println(v1.get(1));
		System.out.println(v1.get(2));
		System.out.println(v1.get(3));
		System.out.println(v1.get(4));
		
		System.out.println(v1.getFirst());
		System.out.println(v1.getLast());
	}
}
