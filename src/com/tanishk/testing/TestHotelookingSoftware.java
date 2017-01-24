package com.tanishk.testing;

import com.tanishk.custmor.Customer;
import com.tanishk.roomservices.Room;
import com.tanishk.staffservice.Reception;

public class TestHotelookingSoftware {

	public static void main(String[] args) {

		Customer c1 = new Customer("Tanishk", 15);
		Customer c2 = new Customer("Kanhaiya", 31);
		Customer c3 = new Customer("Rohan", 16);

		Reception r1 = new Reception("Ajay Rectionaist", 40);

		Room room1 = new Room("Economy", 800);
		Room room2 = new Room("Luxury", 1500);
		Room room3 = new Room("Normal", 500);

		r1.bookRoom(c1, room1);
		r1.bookRoom(c2, room2);
		r1.bookRoom(c3, room3);

		String myOrder1 = c1.placeOrder(r1, "Tea");
		c1.receivedOrder(myOrder1);

		String myOrder2 = c2.placeOrder(r1, "Coffee");
		c2.receivedOrder(myOrder2);

		String myOrder3 = c3.placeOrder(r1, "Breakfast");
		c3.receivedOrder(myOrder3);

	}

}
