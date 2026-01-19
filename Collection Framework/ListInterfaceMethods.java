package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListInterfaceMethods {
	public static void main(String[] args) {
		//Convert Array into ArrayList
		Integer[] arr = {101, 202, 303, 404, 505};
		List<Integer> l1 = new ArrayList(Arrays.asList(arr));
		System.out.println(l1);
		
		System.out.println("=======================================");
		
		// Remove even elements
		Iterator<Integer> itr = l1.iterator();
		while(itr.hasNext()) {
			if(itr.next() % 2 == 0) {
				itr.remove();
			}
		}
		System.out.println(l1);
		
		System.out.println("=======================================");
		
		// sort in both ascending and desending order
		Collections.sort(l1);
		System.out.println("Sorted in ascending order: "+l1);
		
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Sorted in descending order: "+l1);
		
		System.out.println("=======================================");
		
		// Print max and min in the arraylist
		Integer max = Collections.max(l1);
		Integer min = Collections.min(l1);
		
		System.out.println("=======================================");
		
		// Make arraylist immutable
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Mutable ArrayList: "+list);
		
		List<Integer> il = Collections.unmodifiableList(list);
		System.out.println("Immutable ArrayList: "+il);
		il.add(40);
		System.out.println(il);
		
	}
}
