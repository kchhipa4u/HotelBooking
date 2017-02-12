package com.fundamentals.oop.encapsulation;

public class Employee {

	private int salary = 5000;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
		System.out.println(this.salary);
	}
}
