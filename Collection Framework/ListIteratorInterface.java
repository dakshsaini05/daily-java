package com.CollectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterface {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=10;i<=50;i+=10) {
			al.add(i);
		}
		
		System.out.println(al);
		ListIterator<Integer> ltr = al.listIterator();
		
		// Iterate forward
		while(ltr.hasNext()) {
			int i = ltr.next();
			System.out.println(i);
		}
		
		System.out.println("================================================================");
		
		// Iterate backward
		while(ltr.hasPrevious()) {
			int i = ltr.previous();
			System.out.println(i);
		}
		
		// update element
		al.set(2, 88);
		System.out.println(al);
		
		
		// remove element
		while(ltr.hasNext()) {
			Object i = ltr.next();
			if(i.equals(88)) {
				ltr.remove();
			}
		}
		System.out.println(al);
	}
}
