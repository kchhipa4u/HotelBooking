package com.fundamentals.exceptionbasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author kanhaiya.chhipa
 *
 * 1. A checked exception is an unacceptable condition foreseen by the author of a method but outside their immediate control. 
 *    For an example, FileNotFoundException is a checked exception. This exception is thrown if the file that the code is trying 
 *    to access can’t be found. A method, say, readFile(), can declare it to be thrown when it’s unable to access the target file.
 *    
 * 2. Checked exceptions are so named because they’re checked during compilation. If a method call throws a checked exception, 
 *    the compiler checks and ensures that the calling method is either handling the exception or declaring it to be rethrown.
 *    
 * 3. A checked exception is a subclass of the class java.lang.Exception, but it’s not a subclass of java.lang.RuntimeException. 
 *    It’s interesting to note, however, that the class java.lang.RuntimeException itself is a subclass of the class java.lang.Exception.
 */
public class CompileTimeException {
	public static void main( String[] args ) {

		try {
			FileInputStream fi = new FileInputStream( "C:\\te234234mp.text" );
		} catch ( FileNotFoundException e ) {
			e.printStackTrace( );
		}

		System.out.println( "You can continue here." );

	}
}
