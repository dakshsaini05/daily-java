package com.Java8;

import java.util.function.BiPredicate;

public class BiPredicateDemo{
	
	/*
	Without using lambda expression
	@Override
	public boolean test(Integer t, Integer u) {
		if(t.equals(u)) {
			return true;
		}
		return false;
	}
	*/

	public static void main(String[] args) {
		/*
		Without using lamba expression
		BiPredicate<Integer, Integer> checkEquals = new BiPredicateDemo();
		System.out.println(checkEquals.test(5, 5));
		*/	
		
		BiPredicate<String, String> checkEquals = (i, j) -> i.equals(j);
		System.out.println(checkEquals.test("Daksh", "Saini"));
	}
}
