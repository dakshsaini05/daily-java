package com.Java8;

import java.util.function.Supplier;

public class SupplierDemo{
	
	/*
	@Override
	public String get() {
		return "Hello";
	}
	*/

	public static void main(String[] args) {
		/*
		Supplier<String> printS = new SupplierDemo();
		System.out.println(printS.get());
		*/
		
		// generates a random value
		Supplier<Double> printS = () -> Math.random();
		System.out.println(printS.get());
	}
}
