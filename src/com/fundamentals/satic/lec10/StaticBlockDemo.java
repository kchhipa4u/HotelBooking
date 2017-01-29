package com.fundamentals.satic.lec10;

public class StaticBlockDemo {
	
	static{
		System.out.println("I am static block");
	}
	public void display(){
		System.out.println("I am instance/object method");
	}
	
	public static void main(String[] args) {
		System.out.println("I am static method");
		
		StaticBlockDemo sd = new StaticBlockDemo();
		sd.display();
	}
	
	static{
		System.out.println("I am  second static block");
	}
	
	

}
