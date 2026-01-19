package com.CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamClass {
	public static void main(String[] args) {
		List<Integer> al = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println(al);
		
//		Stream<Integer> streamOfNumber = al.stream();
//		streamOfNumber.forEach(i -> System.out.println(i));
		
		Predicate<Integer> p1 = i->i%2==0;
		al.stream().filter(p1).forEach(j->System.out.println(j));
	}
}
