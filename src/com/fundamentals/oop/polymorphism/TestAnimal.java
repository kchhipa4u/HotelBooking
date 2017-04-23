package com.fundamentals.oop.polymorphism;

public class TestAnimal {
	
	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.food();
		
		// Runtime binding
		Animal a2 = new Lion();
		a2.food();
		
		
		Lion l = new Lion();
		l.privateDisp();
		
		Lion l2= l.getObj();
		//a2.m1(10, 20);
	}

}
