package com.fundamentals.satic.lec10;

public class Car {
	
	String namePlate;
	
	int hoursOfStay;

	public Car(String namePlate, int hoursOfStay) {
		this.namePlate = namePlate;
		this.hoursOfStay = hoursOfStay;
	}

	@Override
	public String toString() {
		return "Car [namePlate=" + namePlate + ", hoursOfStay=" + hoursOfStay
				+ "]";
	}
	

}
