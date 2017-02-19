package com.fundamentals.oop.interfaceAndAbstractClass;

/*
 * Final keyword
 *     variable  :- cannot change variable after declaration
 *     method   :- cannot overrride that method
 *     class  :- cannot be sub classed
 */
public class FinalVarDemo {
	
	
	
	public static void main(String[] args) {
		final int x = 0;
		int y =6;
		System.out.println(x);
		System.out.println(y);
		
		// try to change non final variable nd print
		y =8;
		System.out.println(y);
		
		// try to change final variable, conclusion :- will give us compile time error
		//x =10;
	}

}
