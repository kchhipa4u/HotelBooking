package com.fundamentals.exceptionbasics;

import java.io.FileNotFoundException;

public class CheckedExceptionThrowTest {
	
	public static void main(String[] args) throws FileNotFoundException {
		method1();
		System.out.println("In Main method");
	}

	private static void method1() throws FileNotFoundException {
		
			method2();
		
		System.out.println("In method1");
	}

	private static void method2() throws FileNotFoundException {
		method3();
		System.out.println("In method2");
	}

	private static void method3() throws FileNotFoundException  {
		System.out.println("In method3");
		throw new FileNotFoundException();
		
	}

}
