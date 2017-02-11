package com.tanishk.fundamental.control;

public class StringSwitchCase {
	
	public static void main(String args[]) {
		
		visitPlace("Jaipur");
		visitPlace("Udaipur");
		visitPlace("Delhi");
		
	}
	
	public static void visitPlace(String island) {
		 switch(island) {
		  case "Jaipur":
		       System.out.println("User wants to visit Jaipur");
		       break;
		  case "Udaipur":
		       System.out.println("User wants to visit Udaipur");
		       break;
		  case "Delhi":
		       System.out.println("User wants to visit Delhi");
		       break;
		  case "Mumbai":
		       System.out.println("User wants to visit Mumbai");
		       break;
		 default:
		       System.out.println("Unknown Place");
               break;
		 }
	}

}
