package com.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable{
	int id;
	String name;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializationDemo sd = new SerializationDemo();
		sd.id = 1;
		sd.name = "Daksh";
		
		//FileOutputStream
		System.out.println("Serialization started.....");
		
		FileOutputStream fos = new FileOutputStream("person.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(sd);
		
		oos.close();
		fos.close();
		
		System.out.println("Serialization completed.....");
		System.out.println("---------------------------------------------------------");
		System.out.println("Deserialization started.....");
		
		FileInputStream fis = new FileInputStream("person.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerializationDemo sd2 = (SerializationDemo) ois.readObject();
		System.out.println("Deserialization completed.....");
		
		fis.close();
		ois.close();
		
		System.out.println();
		System.out.println(sd2.id+" "+sd2.name);
	}
}
