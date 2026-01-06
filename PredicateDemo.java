package com.Java8;

import java.util.function.Predicate;

// Program to check if the length of a string is if greater then 7 true else false using functional interface

public class PredicateDemo{
	/*
	Without using lambda expression by implemeting Predicate
	
	@Override
	public boolean test(String t) {
		if(t.length()>7) {
			return true;
		}
		return false;
	}
	*/
	
	public static void checkPredicate(Predicate<Integer> p, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(p.test(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		/*
		Without using lambda expression
		
		PredicateDemo obj = new PredicateDemo();
		System.out.println(obj.test("Daksh"));
		*/
		
		Predicate<String> obj = i -> i.length()>7;
		System.out.println(obj.test("Daksh"));
		System.out.println(obj.test("DakshSaini"));
		
		int number[] = {10, 20, -20, -10, 40, 60, 45, 100, 21, 110};
		Predicate<Integer> p1 = i -> i<50;
		
		Predicate<Integer> p2 = i -> i%2==0; // Even number
		
		Predicate<Integer> oddNumber = p2.negate(); // Instead of writing a seperate code for odd numbers we used negate which reversed the behaviour of even number code
		
		checkPredicate(oddNumber, number);
		
		//display numbers less than 50 which must be even
		Predicate<Integer> EvenAndLessThnFifty = p1.and(p2);
		checkPredicate(EvenAndLessThnFifty, number);
		
		System.out.println();
		
		Predicate<Integer> EvenAndLessThnFifty2 = p1.or(p2);
		checkPredicate(EvenAndLessThnFifty2, number);
		
		Predicate<String> eHello = Predicate.isEqual("Hello");
		
		System.out.println(eHello.test("Hello"));
		System.out.println(eHello.test("World"));
	}
}
