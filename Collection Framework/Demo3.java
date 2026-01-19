package com.CollectionFramework;

import java.util.Enumeration;
import java.util.Vector;

public class Demo3 {
	public static void main(String[] args) {
		// Vector
		Vector v = new Vector();
		v.add("Daksh");
		v.add(20);
		v.add(79.6);
		v.add('J');
		
		Enumeration enm = v.elements();
		
		while(enm.hasMoreElements()) {
			Object el = enm.nextElement();
			System.out.println(el);
		}
	}
}
