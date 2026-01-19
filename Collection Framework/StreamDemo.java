package com.CollectionFramework;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,1,2,3,4,4,5,6,7,8,9,10,11,12,13,14,15);
		
		//1. even numbers
		List<Integer> evenNumber = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even numbers: "+evenNumber);
		
		//2. odd number
		List<Integer> oddNumber = numbers.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println("Odd Numbers: "+oddNumber);
		
		//3. remove duplicate
		System.out.print("Remove duplicate: ");
		numbers.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//4. skip 
		System.out.print("Skip by 2 and print: ");
		numbers.stream().distinct().skip(2).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//5. limit
		System.out.print("Print only till 3 elements: ");
		numbers.stream().distinct().limit(3).forEach(i->System.out.print(i+" "));
		System.out.println();
		
		//6. find max number
		int maxNumber = numbers.stream().max(Integer::compare).orElseThrow();
		System.out.println("Max number in the list: "+maxNumber);
		
		//7. count stream with specific prefix
		List<String> s = Arrays.asList("Daksh", "Deepak", "Dilip", "Dinesh", "Vansh", "Shubham", "Natik");
		long countString = s.stream().filter(i->i.startsWith("D")).count();
		System.out.println("Total is: "+countString);
		
		//8. sort list in descending order
		List<Integer> sortedInDesc = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("desceding sorted: "+sortedInDesc);
		
		//9. uppercase
		List<String> upperCaseLetters = s.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("Upper case string: "+upperCaseLetters);
		
	}
}
