package com.postingandpushing;

import java.util.ArrayList;
import java.util.Collections;


class Student3 implements Comparable<Student3>{
	String name;
	int id;
	double marks;
	
	public Student3(String name, int id, double marks) {
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
	public int compareTo(Student3 o) {
		if(this.id>o.id) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparableDemoClass {
	public static void main(String[] args) {
		ArrayList<Student3> slist3 = new ArrayList<Student3>();
		
		Student3 s1 = new Student3("Daksh", 20, 89.00);
		Student3 s2 = new Student3("Jatin", 31, 79.00);
		Student3 s3 = new Student3("Vansh", 15, 98.00);
		
		slist3.add(s1);
		slist3.add(s2);
		slist3.add(s3);
		
		System.out.println(slist3);
		Collections.sort(slist3);
		System.out.println(slist3);
	}
}
