package com.fundamentals.oop.polymorphism;

public class TestPArentChild {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.display(10);
		
		Child c1 = new Child();
		c1.display(11);
		c1.display(11, 12);
		
		Parent p1 = new Child();
		p1.display(12);
	   // p1.display(15, 16);  // This is invalid
		
		// This will throw runtime exception
		/*Child c2 = (Child) new Parent();
		c2.display(17);*/
		main(10);
		
	}
	
	public static void main(int args)
	{
		System.out.println("Argumet entered is "+ args);
	}
	
}
