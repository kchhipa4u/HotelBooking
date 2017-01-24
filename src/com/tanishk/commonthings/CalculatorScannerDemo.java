package com.tanishk.commonthings;

import java.util.Scanner;

public class CalculatorScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the number you want to sum");
		
		int sum =0;
		
		while(sc.hasNextInt())
		{
			int tempVal = sc.nextInt();
			sum = sum + tempVal;
		}
		
		System.out.println("Sum of provided numbers is: " +sum);
	}

}
