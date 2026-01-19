package com.CollectionFramework;

import java.util.Stack;

public class stackClass {
	public static void main(String[] args) {
		Stack s = new Stack();
		System.out.println("Before adding any elements: ");
		System.out.println("Size: "+s.size()); // number of components
		System.out.println("Capacity: "+s.capacity()); // current capacity
		s.add("Daksh");
		s.add(20);
		s.add(0.5);
		s.add("Java");
		System.out.println("After adding elements:");
		System.out.println("Size: "+s.size()); // number of components
		System.out.println("Capacity: "+s.capacity()); // current capacity
		
		s.push("Hello");
		System.out.println("After using push: "+s);
		
		System.out.println(s.peek());
		System.out.println("After using peek: "+s);
		
		System.out.println(s.pop());
		System.out.println("After using pop: "+s);
		
		System.out.println(s.getFirst());
		System.out.println(s.getLast());
		
		System.out.println(s.get(2));
		System.out.println(s.search("Java")); // returns the 1-based position from top of the stack
		
		System.out.println(s.empty());
	}
}
