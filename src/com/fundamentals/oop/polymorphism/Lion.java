package com.fundamentals.oop.polymorphism;

public class Lion extends Animal {
	
	public void food()
	{
		System.out.println("Lion is eating food");
	}
	
	public void m1(int x, int y)
	{
		System.out.println("Number is : " + x + " and " + y);
	}
	
	public Lion getObj(){
		return new Lion();
	}
	
	public int dispVal(int x)
	{
		return 1;
	}
	
	public void privateDisp(){
		System.out.println("Lion private method...");
	}
	
	public void getMultiObj(){
		for(int x=0; x<5; x++)
		{
			new Lion();
		}
	}
}
