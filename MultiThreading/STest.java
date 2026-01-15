package com.multithreading;

//Synchronizatin
class Car implements Runnable{

	@Override
	public void run() { //method level lock [Method synchronization]
		
		try {
			System.out.println(Thread.currentThread().getName()+"Parking allot mei aa jao");
			Thread.sleep(3000);
			
			synchronized(this) { // block level synchronization
				System.out.println(Thread.currentThread().getName()+"Car ke andar jao");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+"Car chlana start kiyaa");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+"Vapas aake car park kar do");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
}

class Student implements Runnable {

	@Override
	public synchronized void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+"Class se bahar gaya");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"Notice board wale area mei enter hua");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"Notice board pr jo notice likha hua tha usko pdha");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+"Notice pdhne ke baad institute se bahar nikal gaya");
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
}

public class STest {
	public static void main(String[] args) {
		
		Car c = new Car();
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		Thread t3 = new Thread(c);
		t1.setName("SON-1");
		t2.setName("SON-2");
		t3.setName("SON-3");
		t1.start();
		t2.start();
		t3.start();
		
		/*
		Student s = new Student();
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		t1.setName("SON-1");
		t2.setName("SON-2");
		t3.setName("SON-3");
		t1.start();
		t2.start();
		t3.start();
		*/
	}
}
