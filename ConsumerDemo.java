package com.Java8;

import java.util.function.Consumer;

public class ConsumerDemo implements Consumer<String>{
	
	@Override
	public void accept(String t) {
		System.out.println(t);
	}

	public static void main(String[] args) {
		Consumer<String> s = new ConsumerDemo();
		s.accept("Daksh");
	}
}
