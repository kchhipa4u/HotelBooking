package com.tanishk.commonthings;

import java.util.Scanner;

public class StudentCareerOption {
	
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Please enter your career Option");
      
     String optedCareer =  sc.next();
     
     if(optedCareer.equals("Arts"))
     {
    	 System.out.println("You will become an IAS...");
     }
     
     else if(optedCareer.equals("Commerce")){
    	 System.out.println("You will become a CA...");
     }
     
     else if(optedCareer.equals("Science")){
    	 System.out.println("You will become an engineer...");
     }
     
     else{
    	 System.out.println("Not sure about your career path....");
     }
		
	}

}
