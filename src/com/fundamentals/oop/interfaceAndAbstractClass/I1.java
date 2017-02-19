package com.fundamentals.oop.interfaceAndAbstractClass;

public interface I1 {

	// it may give ambiguity error if other interface have same variable name
	int x =10;
	
	// it will never give ambiguity problem even if other interface have defined same method because we have only declare method 
	// here not defined here
	public void m1();
}
