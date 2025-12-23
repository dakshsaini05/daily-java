package com.postingandpushing;

//---------- Functional Interfaces ----------

@FunctionalInterface
interface EvenOdd {
 boolean check(int a);
}

@FunctionalInterface
interface Sum {
 void add(int a, int b);
}

@FunctionalInterface
interface StringEmpty {
 boolean isEmpty(String s);
}

@FunctionalInterface
interface UpperCase {
 String convert(String str);
}

@FunctionalInterface
interface Prime {
 boolean isPrime(int n);
}

@FunctionalInterface
interface Factorial {
 void fact(int num);
}

@FunctionalInterface
interface Concat {
 String concat(String s1, String s2);
}

@FunctionalInterface
interface Palindrome {
 boolean check(String str);
}

//---------- Main Class ----------

public class FunctionalInterfaceClass {

 public static void main(String[] args) {

     // Check even or odd
     EvenOdd evenOdd = a -> a % 2 == 0;
     System.out.println(evenOdd.check(14));

     // Sum of two numbers
     Sum sum = (a, b) -> System.out.println(a + b);
     sum.add(10, 40);

     // Check if string is empty
     StringEmpty emptyCheck = s -> s.isEmpty();
     System.out.println(emptyCheck.isEmpty("Hello"));

     // Convert string to uppercase
     UpperCase upper = str -> str.toUpperCase();
     System.out.println(upper.convert("daksh"));

     // Check prime number
     Prime prime = n -> {
         if (n <= 1) return false;
         for (int i = 2; i * i <= n; i++) {
             if (n % i == 0) return false;
         }
         return true;
     };
     System.out.println(prime.isPrime(19));

     // Find factorial
     Factorial factorial = num -> {
         int result = 1;
         for (int i = 1; i <= num; i++) {
             result *= i;
         }
         System.out.println(result);
     };
     factorial.fact(5);

     // Concatenate strings
     Concat concat = (s1, s2) -> s1.concat(s2);
     System.out.println(concat.concat("Daksh ", "Saini"));

     // Check palindrome
     Palindrome palindrome = str -> {
         String reversed = new StringBuilder(str).reverse().toString();
         return str.equals(reversed);
     };
     System.out.println(palindrome.check("madam"));
 }
}
