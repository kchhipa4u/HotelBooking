package com.tanishk.fundamental.callByValAndRef;

public class CallByValueDemo {

	int data = 50;

	void change(int data) {  // Method variables go into the stack
		data = data + 100;// changes will be in the local variable only
		System.out.println("Local value " + data);
	}

	public static void main(String[] args) {

		CallByValueDemo op = new CallByValueDemo();

		System.out.println("before change " + op.data);
		op.change(500);
		System.out.println("after change " + op.data);

	}

}
