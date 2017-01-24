/**
 * 
 */
package com.tanishk.custmor;

import com.tanishk.staffservice.Reception;

/**
 * @author kanhaiya.chhipa
 *
 */
public class Customer {

	private String name;
	private int age;
	
	public Customer(String customerName, int customerAge) {
		name = customerName;
		age = customerAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String placeOrder(Reception r1, String typeOfOrder) {
		if(age > 18)
		{
			System.out.println("Order placed to Receptionist ->" + r1.getName() + " for -> " + typeOfOrder);
		}
		
		return typeOfOrder;
		
	}

	public void receivedOrder(String abc) {
		if(age > 18)
		System.out.println("Thanks, I received order of " + abc);
	}

}
