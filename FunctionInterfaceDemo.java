package com.Java8;

import java.util.function.Function;

public class FunctionInterfaceDemo {
	public static void main(String[] args) {
		Function<String, Integer> countCharacters = i -> i.trim().length();
		System.out.println(countCharacters.apply("Daksh Saini"));
	}
}
