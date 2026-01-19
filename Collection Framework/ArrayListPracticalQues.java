package com.CollectionFramework;

import java.util.ArrayList;

public class ArrayListPracticalQues {
	public static void main(String[] args) {
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(11);
		al1.add(47);
		al1.add(69);
		al1.add(88);
		al1.add(11);
		al1.add(36);
		al1.add(11);
		al1.add(89);
		al1.add(11);
		
		
		// Question 1. -> Remove duplicate numbers
		System.out.println("Before removing the duplicates: "+al1);
		for(int i=0;i<al1.size();i++) {
			for(int j=i+1;j<al1.size();j++) {
				if(al1.get(i).equals(al1.get(j))) {
					al1.remove(j);
					j--;
				}
			}
		}
		System.out.println("After removing the duplicates: "+al1);
		
		System.out.println("================================================");
		
		// Question 2 -> Find the max and min in the arraylist
		int min = Integer.MAX_VALUE;
		int secMin = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int num : al1) {
			if(num > max) {
				secMax = max;
				max = num;
			} else if(num > secMax && num != max) {
				secMax = num;
			}
			
			if(num < min) {
				secMin = min;
				min = num;
			} else if(num < secMin && num != min) {
				secMin = num;
			}
		}
		System.out.println("Second Max: "+secMax+", "+"Second Min: "+secMin);
		
		System.out.println("================================================");
		
		// Quesiton 3 -> Move all the zeros of arraylist
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(0);
		a.add(2);
		a.add(0);
		a.add(3);
		a.add(0);
		a.add(4);
		int lastIndex = a.size()-1;
		// 1. Move all the non-zeroes to the last
		for(int i=a.size()-1;i>=0;i--) {
			if(a.get(i) != 0) {
				a.set(lastIndex, a.get(i));
				lastIndex--;
			}
		}
		// 2. put 0 in remaining places
		for(int i=0;i<=lastIndex;i++) {
			a.set(i, 0);
		}
		System.out.println(a);
		
		System.out.println("================================================");
		
		// Question 4 -> remove all the zeros from the arraylist
		for(int i=0;i<a.size();i++) {
			if(a.get(i) == 0) {
				a.remove(i);
			}
		}
		System.out.println(a);
		
		
		
		
	}
}
