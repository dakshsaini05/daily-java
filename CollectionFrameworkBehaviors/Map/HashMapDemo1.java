package com.collectionframeworkbehaviors;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class Daksh {
	Integer id;
	String name;
	public Daksh(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Daksh() {
		super();
	}
}

public class HashMapDemo1 {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "Java");
		hm.put(2, "SpringBoot");
		hm.put(3, "MicroServices");
		
		System.out.println(hm);
		
		HashMap hm2 = new HashMap();
		Daksh d1 = new Daksh(1, "Java");
		hm2.put("Daksh", "Java");
		hm2.put(d1, "SpringBoot");
		hm2.put(4, "MicroServices");
		System.out.println(hm2);
		
		
		HashMap<Integer, String> hm3 = new HashMap();
		hm3.put(1, "Java");
		hm3.put(2, "SpringBoot");
		hm3.put(3, "MicroServices");
		// ways to access the data
		// 1. get method
		Object data = hm3.get(3);
		System.out.println(data);
		
		// 2. values() for getting values
		Collection<String> data1 = hm3.values();
		Iterator<String> itr1 = data1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		// 3. keySet() for getting keys
		Set<Integer> s = hm3.keySet();	
		Iterator<Integer> itr2 = s.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// 4. entrySet() for getting entire pair
		Set entry = hm3.entrySet();
		Iterator itr3 = entry.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
	}
}
