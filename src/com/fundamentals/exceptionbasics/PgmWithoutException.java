package com.fundamentals.exceptionbasics;

/**
 * @author kanhaiya.chhipa
 * 
 * 1. Without try catch block Program will terminate at L.N. 16
 * 
 * 2. Try catch block helps in handle the exception, and program will continue execution after handling the exception
 *
 */
public class PgmWithoutException {

	public static void main( String[] args ) {
		int no1 = 100;
		int no2 = 0;

		try {
			int value = no1 / no2;
			System.out.println( value );
		} catch ( ArithmeticException e ) {
			System.out.println("Please continue even if you provide zero..");
			e.printStackTrace();
		}

		double deposit = no1 + 1000.0;
		System.out.println( "Deposit Amont: " + deposit );
	}
}
