package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streammm {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,1,2,3,4,5,6,7,8,9,10,10,11,12,13,14,15);
		
		// 1. Print even elements
		List<Integer> evenNumber = new ArrayList<Integer>();
		
		evenNumber = numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(evenNumber);
		
		// 2. Print odd elements
		List<Integer> oddNumber = new ArrayList<Integer>();
		
		oddNumber = numbers.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(oddNumber);
		
		// 3. Remove duplicates
		System.out.print("Remove duplicate elements: ");
		numbers.stream().distinct().forEach(i->System.out.print(i+" "));
		
		System.out.println();
		
		// 4. skip by 2 numbers
		System.out.print("Skip elements by 2: ");
		numbers.stream().distinct().skip(2).forEach(i->System.out.print(i+" "));
		
		
		// 5. Find max number from list of integers
		int maxNumber = numbers.stream().max(Integer::compare).orElseThrow();
		System.out.println(maxNumber);
		
		// 6. sort a list of integer in decending order using the streaming api
		List<Integer> sortedNumberInDescendingOrder = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortedNumberInDescendingOrder);
		
		// 7. Count stream with specific prefix
		List<String> s = Arrays.asList("Shubham","shivangi","shivraj","shakal","Daksh","vansh","jatin","piyush");
		long countName = s.stream().filter(i->i.startsWith("S")).count();
		System.out.println(countName);
		
		// 8. find first non-reapiting character in a string
		List<String> upperCaseLetter = s.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		
		
		// 9. convert strings to upper case
		
		// 10. sum of numbers in a list
		
		// 11. count frequency the frequency of character in a string
		
		// 12. count frequency the frequency of each character in a string
		
		// 13. calculate avg of numbers
		
		// 14. reverse each string in a list
		
		// 15. find the most frequent character in a string
		
		// 16. find the longest word from the sentence
	}
}
