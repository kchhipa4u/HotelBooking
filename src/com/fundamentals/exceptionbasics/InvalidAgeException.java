package com.fundamentals.exceptionbasics;

public class InvalidAgeException extends Exception {
	InvalidAgeException( String s ) {
		super( s );
	}
}
