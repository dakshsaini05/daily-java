package com.PatternPrinting;

public class Hollow_right_angled_triangle_08 {
	public static void main(String[] args) {
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			if(i == 1 || i == 2 || i == n) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			} else {
				// 1 -> *
				System.out.print("* ");
				// (row - 2) spaces
				for(int j=1;j<=(i-2);j++) {
					System.out.print("  ");
				}
				
				// 1 -> *
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
