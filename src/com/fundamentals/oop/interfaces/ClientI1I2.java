package com.fundamentals.oop.interfaces;

public class ClientI1I2 implements I1, I2 {

	public static void main(String[] args) {
		ClientI1I2 obj = new ClientI1I2();
		//System.out.println(obj.x);
		
		I1 myI1 = new ClientI1I2();
		System.out.println(myI1.x);
	}

	@Override
	public void m1() {
		
	}
}
