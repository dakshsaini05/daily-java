package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

class Student1 implements Comparable<Student1>{
	String name;
	int id;
	double marks;
	
	public Student1(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	@Override
	public int compareTo(Student1 o) {
		if(this.id>o.id) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		ArrayList<Student1> slist1 = new ArrayList<Student1>();
		
		Student1 s1 = new Student1("Daksh", 20, 89.00);
		Student1 s2 = new Student1("Jatin", 31, 79.00);
		Student1 s3 = new Student1("Vansh", 15, 98.00);
		
		slist1.add(s1);
		slist1.add(s2);
		slist1.add(s3);
		
		System.out.println(slist1);
		Collections.sort(slist1);
		System.out.println(slist1);
	}
}
