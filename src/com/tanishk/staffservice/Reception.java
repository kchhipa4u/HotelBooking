package com.tanishk.staffservice;

import com.tanishk.custmor.Customer;
import com.tanishk.roomservices.Room;

public class Reception {
	
	private String name;
	private int age;
	
	public Reception(String recptName, int recptAge) {
		name = recptName;
		age = recptAge;
	}

	public void bookRoom(Customer customer, Room room) {
		int customerAge = customer.getAge();
		if (customerAge >= 18) {
			System.out.println("Room booked for Customer-> "
					+ customer.getName() + " and Customer age is-> "
					+ customer.getAge());
		} else {
			System.out
					.println(customer.getName() +", You are minor, and not allowed to book a room in the hotel...");
		}
	}

	public String getName() {
		return name;
	}
	
}
