package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class demo1 {
	public static void main(String[] args) {
		// ArrayList
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i=10;i<=50;i+=10) {
			al1.add(i);
		}
		System.out.println(al1);
		
		Iterator<Integer> itr = al1.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		System.out.println("contains() method: "+al1.contains(40));
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=60;i<=100;i+=10) {
			al2.add(i);
		}
		al1.addAll(al2);
		System.out.println("addAll() method: "+al1);
		
	}
}
