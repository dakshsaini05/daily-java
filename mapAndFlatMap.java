package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mapAndFlatMap {
	public static void main(String[] args) {
		//example for map method
		List<Integer> numbers = Arrays.asList(1,2,3);
		numbers.stream().map(i->i+i).forEach(j->System.out.println(j));
		
		//example for flatMap method
		List<String> l1 = Arrays.asList("Daksh", "Vansh", "Piyush");
		List<String> l2 = Arrays.asList("Daksh", "Vansh", "Piyush");
		List<String> l3 = Arrays.asList("Daksh", "Vansh", "Piyush");
		
		System.out.println("=========");
		
		List<List<String>> complex = Arrays.asList(l1, l2, l3);
		
		// adding @gmail.com at the end of each string
		
		// without stream api
		for(List<String> x:complex) {
			for(String a:x) {
				System.out.println(a.concat("@gmail.com"));
			}
		}
		
		System.out.println("=========");
		
		//with Stream API
		complex.stream().flatMap(i->i.stream()).map(i->i.concat("@gmail.com")).forEach(j->System.out.println(j));
	}
}
