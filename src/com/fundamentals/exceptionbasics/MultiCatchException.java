package com.fundamentals.exceptionbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * Try with multi catch is valid scenario
 * In case of try with multi catch make sure that your parent class stay at the bottom in catch statements, like in case below 
 * Exception comes after FileNotFoundException, else we will get an error in the program.
 */
public class MultiCatchException {
	public static void main( String[] args ) {
		try {

			//int val = 45 / 0; // ERROR: So below lines in try block will be not executed. // Runtime Exception
			FileInputStream fi = new FileInputStream( "C:\\temp.text" );   // Checked exception, compiletime

		}  catch (FileNotFoundException e ) {
			System.out.println("FileNotFoundException" );
			e.printStackTrace( );

		} 
		catch (ArithmeticException e) {
			System.out.println( "ArithmeticException" );
			e.printStackTrace( );

		}
		catch (Exception e ) {
			System.out.println( "Exception is called." );
			e.printStackTrace( );

		}

		System.out.println( "Continue program here!" );
	}
}
