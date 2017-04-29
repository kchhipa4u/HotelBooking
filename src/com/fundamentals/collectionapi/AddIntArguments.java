package com.fundamentals.collectionapi;

public class AddIntArguments {
	
	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		int firstArgument = Integer.parseInt(args[0]);
		
		System.out.println(firstArgument + Integer.parseInt(args[1]));
	}

}
