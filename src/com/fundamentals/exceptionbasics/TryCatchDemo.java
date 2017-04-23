package com.fundamentals.exceptionbasics;

/*
 *  Unchecked Exception Demo
 *  
 *  3 possible combination of handling exception
 *  1. try --> catch
 *  2. try --> catch --> finally
 *  3. try --> finally
 *  
 *  Execution flow will be like, it will go to try block execute it, if any error occurs then it will go to catch, and then
 *  goes to finally block
 *  
 *  catch and finally cann't exist without try block
 *  
 *  system.exit(0), execution of this command which stops finally block execution, but we need to careful in this. System.exit() 
 *  either come before exception prone code or to be part of catch block.
 *  
 *  
 */
public class TryCatchDemo {
	
	public static void main(String[] args) {
		int no1 = 100;
		int no2 = 0;
		
		
		try{
			//ArithmeticException e = new ArithmeticException();
			//System.exit(0);
			int value = no1 / no2;   // exception prone code....
			//System.exit(0);
			System.out.println( value );
			System.out.println("Goyal....");
			//System.exit(0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("I am into the catch block...");
			//System.exit(3);
		}
		finally{
			System.out.println("I am into the finally......");
		}
		
		System.out.println("Tanishk");
	}

}
