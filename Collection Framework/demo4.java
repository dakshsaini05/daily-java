package com.CollectionFramework;

import java.util.Iterator;
import java.util.Stack;

public class demo4 {
	public static void main(String[] args) {
		Stack s = new Stack();
		s.add("Daksh");
		s.add(45);
		s.add(19.5);
		s.add("error");
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
		
		s.push("Hello");
		System.out.println("After push(): "+s);
		s.pop();
		System.out.println("After pop(): "+s);
		
		System.out.println("Using peek(): "+s.peek());
	}
}
