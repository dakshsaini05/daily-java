package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

class Mythread1 extends Thread {
	ArrayList<Integer> al;
	
	public Mythread1(ArrayList<Integer>al) {
		this.al=al;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			al.add(i);
		}
	}
}

class Mythread2 extends Thread {
	ArrayList<Integer> al;
	
	public Mythread2(ArrayList<Integer>al) {
		this.al=al;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			al.add(i);
		}
	}
}

class V1 extends Thread {
	Vector<Integer> vec1;
	
	public V1(Vector<Integer>vec1) {
		this.vec1=vec1;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			vec1.add(i);
		}
	}
}

class V2 extends Thread {
	Vector<Integer> vec1;
	
	public V2(Vector<Integer>vec1) {
		this.vec1=vec1;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=50;i++) {
			vec1.add(i);
		}
	}
}

public class syncronizationInArrayList {
	public static void main(String[] args) throws InterruptedException{
//		ArrayList<Integer> al = new ArrayList<Integer>();
//		Mythread1 t1 = new Mythread1(al);
//		Mythread2 t2 = new Mythread2(al);
//		t1.start();
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println("ArrayList size: "+al.size());
		
		Vector<Integer> vec1 = new Vector<Integer>();
		V1 vector1 = new V1(vec1);
		V2 vector2 = new V2(vec1);
		vector1.start();
		vector2.start();
		vector1.join();;
		vector2.join();
		System.out.println("Vector size: "+vec1.size());
	}
}
