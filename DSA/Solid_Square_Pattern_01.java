package com.PatternPrinting;

public class Solid_Square_Pattern_01 {
	public static void main(String[] args) {
		int n = 4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
