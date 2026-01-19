package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee { // target class
	int age;
	String name;
	double sal;

	public Employee(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

class A01 implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.sal>o2.sal) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorClass {
	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<Employee>();
		
		Employee e1 = new Employee(20, "Daksh", 20000.00);
		Employee e2 = new Employee(21, "Jatin", 10000.00);
		Employee e3 = new Employee(26, "Vansh", 15000.00);
		
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		System.out.println(elist);
		
		/* (Anonaymous function)
		Comparator<Employee> ee = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				if(o1.sal>o2.sal) {
					return 1;
				} else {
					return -1;
				}
			}
		};
		*/
		
		Comparator<Employee> ee = (Employee o1, Employee o2) -> {
			if(o1.sal > o2.sal) {
				return 1;
			} else {
				return -1;
			}
		};
		
		Collections.sort(elist, ee);
		System.out.println(elist);
	}
}
