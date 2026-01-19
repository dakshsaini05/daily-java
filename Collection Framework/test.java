package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class test {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList();
		al1.add(11);
		al1.add(26);
		al1.add(89);
		al1.add(44);
		al1.add(47);
		al1.add(69);
		al1.add(12);
		al1.add(48);
		al1.add(77);
		al1.add(41);
		al1.add(97);
		al1.add(89);
		
		// Convert ArrayList into array
		System.out.println("Convert ArrayList into Array");
		Object[] arr = al1.toArray();
		for(Object i : arr) {
			System.out.println(i);
		}
		
		System.out.println("=====================================================");
		
		// Reverse 
		System.out.println("Reverse");
		System.out.println("Before reversed: "+al1);
		System.out.println("After reversed: "+al1.reversed());
		
		System.out.println("=====================================================");
		
		// Sort
		System.out.println("Sort");
		System.out.println("Before sort: "+al1);
		al1.sort(null);
		System.out.println("After sort: "+al1);
		
		System.out.println("=====================================================");
		
		// Swap
		System.out.println("Swap index 1 and 4");
		System.out.println("Before swap: "+al1);
		int temp = al1.get(1);
		al1.set(1, al1.get(4));
		al1.set(4, temp);
		System.out.println("After swap: "+al1);
		
		System.out.println("=====================================================");
		
		// remove even elements
		System.out.println("Remove all even elements");
		System.out.println("Before removing all even elements: "+al1);
		Iterator<Integer> itr = al1.iterator();
		while(itr.hasNext()) {
			if(itr.next() % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println("After removing all even elements: "+al1);
		
		System.out.println("=====================================================");
		
		// Find the frequency of number
		int ele = 89;
		int count = 0;
		for(int num : al1) {
			if(num == ele) {
				count++;
			}
		}
		System.out.println(ele+" appeared "+count+" times");
		
		
		
		
	}
}
