package com.PatternPrinting;

public class Hollow_pyramid_09 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			// spaces / part 1
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			// part 2 (star, space, star)
			if(i == 1 || i == n) {
				for(int j=1;j<=2*i-1;j++) {
					System.out.print("* ");
				}
			} else {
				System.out.print("* ");
				for(int k=1;k<=2*i-3;k++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
