package com.fundamentals.exceptionbasics;

import java.io.FileNotFoundException;

public class UnCheckedExceptionThrowTest {
	
	public static void main(String[] args) {
		method1();
		System.out.println("In Main method");
	}

	private static void method1()  {
		
			method2();
		
		System.out.println("In method1");
	}

	private static void method2()  {
		method3();
		System.out.println("In method2");
	}

	private static void method3() throws NullPointerException  {
		System.out.println("In method3");
		throw new NullPointerException();
		
	}

}
