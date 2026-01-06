package com.Java8;

import java.util.function.BiConsumer;

public class BiConsumerDemo implements BiConsumer<String, String>{
	
	@Override
	public void accept(String t, String u) {
		System.out.println(t.concat(u).length());
	}

	public static void main(String[] args) {
		BiConsumer<String, String> printConcat = new BiConsumerDemo();
		printConcat.accept("Daksh", "Saini");
	}
}
