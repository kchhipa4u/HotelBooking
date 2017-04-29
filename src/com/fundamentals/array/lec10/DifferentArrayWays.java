package com.fundamentals.array.lec10;

public class DifferentArrayWays {
	
	public static void main(String[] args) {
		
		//Defined and initialized at same time
		int[] numbers = {10, 15, 25, 8, 35, 40, 15};
		
		// Defined
		int[] items = new int[8];
		
		items[0] = 23;
		items[1] = 33;
		
		System.out.println(numbers[3]);
		numbers[3] = 70;
		System.out.println(numbers[3]);
		
		
		System.out.println(items[7]);
	}

}
