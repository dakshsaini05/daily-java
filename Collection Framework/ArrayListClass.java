package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); //Hetrogenous Elements
		al.add(100);
		al.add(200);
		al.add(10.5);
		al.add("Rohit");
		al.add("Abhi");
		al.add(true);
		System.out.println(al);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
//		al.add(0, "Daksh");
//		ArrayList al2 = new ArrayList();
//		al2.add(22);
//		al2.add(33);
//		al2.add(44);
//		al2.addAll(al);
//		System.out.println(al2);
	}
}
