package com.Java8;

import java.util.function.BiFunction;

public class BiFunctionDemo{
	
	/*
	Without lambda expression ---> implements BiFunction
	@Override
	public Integer apply(String t, String u) {
		int count = t.concat(u).length();
		return count;
	}
	*/

	public static void main(String[] args) {
		/*
		Without lambda expression
		BiFunction<String, String, Integer> countChar = new BiFunctionDemo();
		System.out.println(countChar.apply("Daksh", "Saini"));*/
		
		BiFunction<String, String, Integer> countChar = (t,u) -> t.concat(u).length();
		System.out.println(countChar.apply("Daksh", "Saini"));
	}
}
