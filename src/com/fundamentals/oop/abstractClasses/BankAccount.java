package com.fundamentals.oop.abstractClasses;

import com.fundamentals.oop.interfaces.I1;

/**
 * @author kanhaiya.chhipa
 * 
 * 1. Abstract class must have abstract keyword.
 * 
 * 2. Abstract class = concrete class + INterface
 * 
 * 3. If there is any abstract method in abstract class then we have to explicitly put abstract keyword with method there while this rule 
 *    is not applicable for interface. Interface implicitly includes abstract keyword if we do not apply with method.
 * 
 * 4. Abstract class may or may not have abstract method (means this class can exist without abstract method as well)
 * 
 * 5. If you have any abstract method in any class then that class must be defined as abstract class.
 * 
 * 6. Abstract class does not have contractor because we can't create object of abstract class.
 * 
 * 7. Abstract class can extends other concrete classes.
 * 
 * 8. Abstract class can implements any interface as well.
 * 
 *
 */
public abstract class BankAccount {
	
	String name = "Tanishk";
	
	public void depositMoney(){
		System.out.println("Money deposited...");
	}
	
	public void withdrawMoney(){
		System.out.println("Money withdrawn.....");
	}
	
	public abstract void calcInterest();

}
