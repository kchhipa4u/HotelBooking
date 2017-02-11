package com.tanishk.fundamental.thisAndSuper;

class AA {
	AA() {
		System.out.println("hello a");
	}

	AA(int x) {
		this(); 
		System.out.println(x);
	}
}

public class TestThis3 {
	public static void main(String args[]) {
		AA a = new AA(10);
	}
}
