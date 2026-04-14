package com.PatternPrinting;

public class Diamond_10 {
	public static void main(String[] args) {
		int n = 5;
		
		// Solid pyramid (Upper part)
		for(int i=1;i<=n;i++) {
			// spaces
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			// stars
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// Inverted pyramid (Lower part)
		for(int i=1;i<=n;i++) {
			// spaces
			if(i == 1) {
				continue;
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print("  ");
			}
			// stars
			for(int k=1;k<=2*n-2*i+1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
