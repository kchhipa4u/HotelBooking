package com.fundamentals.oop.interfaces;

public class FirstInterfaceImpl extends SuperClass implements FirstInterface {

	@Override
	public void m1() {
		System.out.println("this is m1()");
	}

	@Override
	public void m2() {
		System.out.println("this is m2()");
	}
	
	public static void main(String[] args) {
		
		// cannot create instance of interface
		
		// FirstInterface fi = new FirstInterface();
		
		FirstInterfaceImpl fimpl = new FirstInterfaceImpl();
		System.out.println(x);
	}

}
