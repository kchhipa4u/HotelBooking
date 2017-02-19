package com.fundamentals.oop.interfaceAndAbstractClass;

/*
 * Interface is defined with keyword interface
 * 
 * It consists 2 things
 *    1. variable  :- public, static, and final
 *    2. method declaration only :- public, and abstract
 *    
 *  Java does not supports multiple inheritance, but it could be achieved using Interface
 */

public interface FirstInterface {
	
	// interface can only have variables like public static final. Other modifiers are not allowed.
	
	// final :- if applied with variables then we cannot change the value of that variable
	public static final int x =5;
	
	// if we do not put public static final with variables then JVM will automatically append these.
	int y = 10;
	
	// I can only declare the method not define the method, and we append abstract keyword with the method
	public abstract void m1();
	
	// cannot define the method
	/*public void m2(){
		
	}*/
	
	// JVM will append the abstract, and public keywords if we do not write with method
	public void m2();
	
	// interface does not have constructor. We cannot create an object of interface

	
}
