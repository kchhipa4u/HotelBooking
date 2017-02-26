package com.fundamentals.oop.polymorphism;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.food();
		
		Animal a2 = new Lion();
		a2.food();
		//a2.m1(10, 20);
	}

}
