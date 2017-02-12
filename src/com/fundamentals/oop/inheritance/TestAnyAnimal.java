package com.fundamentals.oop.inheritance;

public class TestAnyAnimal {

	public static void main(String[] args) {
		Mammal mm1 = new Mammal();
		mm1.walk();
		
		Elephant ee1 = new Elephant();
		ee1.walk();
		ee1.feedChild();
		
		Animal aa = new Animal();
	}
}
