package com.tanishk.fundamental.getterAndSetter;

public class StudentDemo {
	
	String name;
	int age;
	
	public StudentDemo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		StudentDemo sd1 = new StudentDemo("Tanishk", 16);
		System.out.println(sd1.getName());
		System.out.println(sd1);
		
		sd1.setName("Kanhaiya");
		
		System.out.println(sd1);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "StudentDemo [name=" + name + ", age=" + age + "]";
	}
	
}
