package com.fundamentals.satic.lec10;

import java.util.Scanner;


// Car 1 --> AAA1, stay- 2hr
// Car 2 --> BBB1, stay - 3hr
// if name plate is blank then return me validation message to enter correct name plate

// if time stay is > 12 hr then do not accept parking 

// don't allow more than 5 Cars in my parking place

public class CarParking {
	
	public static void main(String[] args) {
		
		System.out.println("Please enter your Car Nameplate");
		Scanner sc1 = new Scanner(System.in);
		String namePlate = sc1.next();
		
		int sum =0;
		
		while(namePlate.equals("0"))
		{
			System.out.println("you have provided invalid name plate. Provide correct name plate");
			namePlate = sc1.next();
		}
		
		while(sum < 5)
		{
			sum++;
			System.out.println("My given name plate is " + namePlate);
			namePlate = sc1.next();
			System.out.println(new Car(namePlate, 1));
		}
		
		
	}

}
