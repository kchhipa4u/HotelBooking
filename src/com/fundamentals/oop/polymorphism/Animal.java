package com.fundamentals.oop.polymorphism;

/*
 * Overriding Rules :
 * 
 * 1. overriding and overridden method signature must be same
 * 2. Method overriding is not possible in same class
 * 3. It supports runtime binding
 * 4. However method signature must be same but there is an exception here that we can change return type in case of 
 *    covariant type (Parent or Child)
 * 5. Access Modifier Rule :- Child class method modifier must have more visibility than Parent class.
 * 6. Final method can't be overridden
 * 7. Overriding is not possible in same class while overloading is possible in same class.
 * 8. Only instance method can be overridden in java on static
 * 9. Private method can't be overriden in java
 */
		
public class Animal {

	protected void food()
	{
		System.out.println("Animal can eat food...");
	}
	
	public void m1(int x)
	{
		System.out.println("Number is : " + x);
	}
	
	public Animal getObj(){
		return new Animal();
	}
	
}
