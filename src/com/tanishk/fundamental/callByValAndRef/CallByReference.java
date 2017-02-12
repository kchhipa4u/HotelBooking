package com.tanishk.fundamental.callByValAndRef;

public class CallByReference {

	int data = 50;

	void change(CallByReference op1) {
		op1.data = op1.data + 100; // changes will be in the instance variable
	}

	public static void main(String[] args) {

		CallByReference ref = new CallByReference();

		System.out.println("before change " + ref.data);
		ref.change(ref);// passing object
		System.out.println("after change " + ref.data);
	}

}
