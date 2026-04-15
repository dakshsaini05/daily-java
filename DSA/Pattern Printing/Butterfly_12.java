package com.PatternPrinting;

public class Butterfly_12 {
	public static void main(String[] args) {
		int n = 4;
		
		// Upper half
		for(int i=1;i<=n;i++) {
			// Part 1(Right angled triangle)
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			// Part 2 (Spaces in inverted pyramid shape)
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			
			// Part 3 Reverse right angled triangle
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// Lower half
		for(int i=1;i<=n;i++) {
			// Part 4 (Inverted right angled triangle)
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			
			// Part 5 (space pyramid)
			for(int j=1;j<=2*(i-1);j++) {
				System.out.print("  ");
			}
			
			// Part 6 (reverse inverted right angled triangle)
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			
			
			System.out.println();
		}
	}
}
