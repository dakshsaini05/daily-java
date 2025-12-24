package com.postingandpushing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student4 {
	String name;
	int id;
	double marks;
	
	public Student4(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}
	
	
}

class A03 implements Comparator<Student4> {
	@Override
	public int compare(Student4 o1, Student4 o2) {
		if(o1.id>o2.id) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorDemoClass {
	public static void main(String[] args) {
		ArrayList<Student4> slist4 = new ArrayList<Student4>();
		
		Student4 s1 = new Student4("Daksh", 20, 89.00);
		Student4 s2 = new Student4("Jatin", 31, 79.00);
		Student4 s3 = new Student4("Vansh", 15, 98.00);
		
		slist4.add(s1);
		slist4.add(s2);
		slist4.add(s3);
		
		System.out.println(slist4);
		
		Comparator<Student4> se1 = (Student4 o1, Student4 o2) -> {
			if(o1.id>o2.id) {
				return 1;
			} else {
				return -1;
			}
		};
		
		Collections.sort(slist4, se1);
		System.out.println(slist4);
	}
}
