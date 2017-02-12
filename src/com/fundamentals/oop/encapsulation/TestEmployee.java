package com.fundamentals.oop.encapsulation;

public class TestEmployee {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		System.out.println(emp.getSalary());
		
		emp.setSalary(1000);
	}

}
