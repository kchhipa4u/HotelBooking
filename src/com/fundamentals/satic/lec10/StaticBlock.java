package com.fundamentals.satic.lec10;

public class StaticBlock {
	private static  String	college;
	
	String name;

	static {
		college = "ASCOL";
		System.out.println( "static block is invoked" );
	}

	public static void main( String args[] ) {
		String name = "Tanishk";
		name = "Kanhaiya";
		
		System.out.println( "Hello from main" );

		System.out.println( college ); // ASCOL

		college = "BRITISH";

		System.out.println( college );
	}

}
