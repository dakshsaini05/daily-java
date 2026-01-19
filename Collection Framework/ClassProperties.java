package com.CollectionFramework;

import java.util.Enumeration;
import java.util.Properties;

public class ClassProperties {
	public static void main(String[] args) {
		Properties p = new Properties();
		p.put("java", "12 months"); // key value pairs 
		p.put("python", "8-10 months");
		p.put("Mern", "8 months");
		p.put("C/CPP", "3-5 months");
		
//		Enumeration enm = p.elements();// to extract keys
//		Enumeration enm = p.propertyNames(); // to extract the value
//		while(enm.hasMoreElements()) {
////			Object o = enm.nextElement(); // returns object type value
////			System.out.println(o);
//			
//			String keys = (String)enm.nextElement();
//			String value = p.getProperty(keys);
//			System.out.println(keys+" "+value);
//		}
		
		// to get the values
		/*Enumeration enm = p.elements();
		while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
		}*/
		
		// to get the keys
		/*Enumeration enm = p.propertyNames();
		while(enm.hasMoreElements()) {
			Object o = enm.nextElement();
			System.out.println(o);
		}*/
		
		// to get both keys and values
		Enumeration enm = p.propertyNames();
		while(enm.hasMoreElements()) {
			String keys = (String)enm.nextElement();
			String value = p.getProperty(keys);
			System.out.println(keys+" "+value);
		}
		
	}
}
