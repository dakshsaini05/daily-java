package com.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamsAPIClass {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		
		List<String> names = Arrays.asList("Prerna", "Arun", "Ajay", "Jeevan");
		
		Stream<Integer> streamofNumber = numbers.stream();
		Consumer<Integer> c = i -> System.out.println(i);
		streamofNumber.forEach(c);
		
		
		//square of even numbers without java 8 functionality
		for(Integer a : numbers) {
			if(a%2 == 0) {
				System.out.println(a*a);
			}
		}
		
		//using Stream API
		Function<Integer, Integer> f = i -> i*i;
		numbers.stream().filter(i->i%2==0).map(f).forEach(j->System.out.println(j));
		
		
		// Filter the names that starts with A
		names.stream().filter(i->i.startsWith("A")).forEach(j->System.out.println(j));
		
		//covert tot upper case
		names.stream().filter(i->i.startsWith("A")).map(i->i.toUpperCase()).forEach(j->System.out.println(j));
	}
}
