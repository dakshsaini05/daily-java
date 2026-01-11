package com.mapinterface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

interface A {
	interface B {
		static void display() {
			System.out.println("Static method inside the Interface B");
		}
	}
}

class Daksh {
	Integer id;
	String coursename;

	public Daksh(Integer id, String coursename) {
		super();
		this.id = id;
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "Daksh [id =" + id + ", coursename= " + coursename + "]";

	}
}

public class HM {

	public static void main(String[] args) {

		HashMap hm1 = new HashMap();
		hm1.put(1, "java");
		hm1.put(2, "springboot");
		hm1.put(3, "microservices");

		System.out.println(hm1);
		Daksh p1 = new Daksh(1, "Java");

		HashMap hm2 = new HashMap();
		hm2.put("Daksh", "Java");
		hm2.put(p1, "Springboot"); // Key value
		hm2.put(4, "Microservices"); // key must be unique and value need not to be unique
		hm2.put(5, "Microservices");
		hm2.put(5, null);
		hm2.put(null, 6);
		System.out.println(hm2);

		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("Hello", "hi");
		lhm.put(2, "Piyush");
		lhm.put(4, "SpringBoot");
		lhm.put("Junit", "API");

		System.out.println(lhm);

		Hashtable ht = new Hashtable();
		ht.put(2, "Hello");
//		ht.put(1,null);
//		ht.put(null,2);

		System.out.println(ht);

		TreeMap tm = new TreeMap();
		tm.put(1, "Piyush");
		tm.put(2, "Jatin");
		tm.put(3, "Vivek");
		tm.put(4, "Raju");
		tm.put(5, null);
//		tm.put(null,"Vansh");

		System.out.println(tm);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "SpringBoot");
		hm.put(3, "Microservices");

		String data = hm.get(3);
		System.out.println(data); // if your want to fetch/access the key

		System.out.println("*************************");
		// ************* For value *************
		Collection<String> data1 = hm.values();
		Iterator<String> itr = data1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("*******************************");
		// ************* For Key *****************
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> itr1 = keys.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("*******************************");
		// ************* For Key & Value Pair ****************
		Set entry = hm.entrySet();
		Iterator itr3 = entry.iterator();

		while (itr3.hasNext()) {
			System.out.println(itr3.next());
		}

	}

}
