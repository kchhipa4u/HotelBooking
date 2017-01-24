package com.tanishk.commonthings;

import java.util.Scanner;

public class StudentScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name: ");
		
		String studentName = sc.next();
		System.out.println("Student entered name is: " + studentName);
		
		System.out.println("Please enter your age: ");
		
		int studentAge = sc.nextInt();
		
		System.out.println("Student entered age is: " + studentAge);
		
		System.out.println("please enter your roll no. : ");
		
		int rollNumber = sc.nextInt();
		System.out.println("student entered roll no. is " + rollNumber);
		
		
	}

}
