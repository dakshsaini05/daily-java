package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
	String name;
	int id;
	double marks;
	
	public Student(String name, int id, double marks) {
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

class A02 implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.id>o2.id) {
			return 1;
		} else {
			return -1;
		}
	}
}

public class ComparatorDemo {
	public static void main(String[] args) {
		ArrayList<Student> slist = new ArrayList<Student>();
		
		Student s1 = new Student("Daksh", 20, 89.00);
		Student s2 = new Student("Jatin", 31, 79.00);
		Student s3 = new Student("Vansh", 15, 98.00);
		
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		
		System.out.println(slist);
		
		Comparator<Student> se1 = (Student o1, Student o2) -> {
			if(o1.id>o2.id) {
				return 1;
			} else {
				return -1;
			}
		};
		
		Collections.sort(slist, se1);
		System.out.println(slist);
	}
}
