package com.fundamentals.satic.lec10;

public class PrintThisKeyword {

	public void printThis() {
		System.out.println(this); // prints same reference ID
	}

	public static void main(String[] args) {
		PrintThisKeyword obj = new PrintThisKeyword();
		obj.printThis();

		System.out.println(obj); // prints the reference ID

	}

}
