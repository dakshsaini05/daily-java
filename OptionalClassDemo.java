package com.Java8;
import java.util.Optional;

public class OptionalClassDemo {
	
	//ofNullable() = used when there maybe a null value present
	//of() = used when you are sure there will be a vaue
	public static Optional<String> getName(int id) {
		String name = "Daksh";
		if(id == 1) {
			return Optional.ofNullable(name);
		} else {
			System.out.println("User not found");
			return Optional.ofNullable(null); 
		}
		
	}
	
	public static void main(String[] args) {
		Optional<String> name = getName(2);
		if(name.isPresent()) {
			System.out.println(name.get());
		}
	}
}
