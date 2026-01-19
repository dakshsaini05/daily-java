package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Employee1 implements Comparable<Employee1>{ // target class
	int age;
	String name;
	double sal;

	public Employee1(int age, String name, double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	
	@Override
		public int compareTo(Employee1 o) {
			if(this.sal > o.sal) {
				return 1;
			} else {
				return -1;
			}
		}
	
}

public class ComparableClass {
	public static void main(String[] args) {
		ArrayList<Employee1> elist1 = new ArrayList<Employee1>();
		
		Employee1 e1 = new Employee1(20, "Daksh", 20000.00);
		Employee1 e2 = new Employee1(21, "Jatin", 10000.00);
		Employee1 e3 = new Employee1(26, "Vansh", 15000.00);
		
		elist1.add(e1);
		elist1.add(e2);
		elist1.add(e3);
		
		System.out.println(elist1);
		Collections.sort(elist1);
		System.out.println(elist1);
	}
}
