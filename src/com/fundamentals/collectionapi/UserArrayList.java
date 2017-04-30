package com.fundamentals.collectionapi;

import java.util.ArrayList;
import java.util.List;

public class UserArrayList {
	public static void main( String[] args ) {

		List<User> userList = new ArrayList<>( ); // or LinkedList
		

		List<User> newList =createUser(userList);
		
		System.out.println(newList);
		
		User usr = newList.get(1);
		usr.setId(50);
		usr.setName("Rohan");
		
		System.out.println(newList);
		System.out.println(userList);
		
		newList.remove(1);
		
		System.out.println(userList);
		System.out.println(newList);
		System.out.println(newList.size());
		

		/*System.out.println( "User at index 2: " + userList.get( 2 ) + "\n" );

		userList.add( 2, new User( 10, "New USER" ) );

		for ( User user: userList ) {
			System.out.println( user );
		}*/

	}

	private static List<User> createUser(List<User> userList) {
		userList.add( new User( 5, "User1" ) );
		userList.add( new User( 2, "User2" ) );
		userList.add( new User( 3, "User3" ) );
		userList.add( new User( 4, "User4" ) );
		userList.add( new User( 5, "User5" ) );
		
		return userList;
	}
	
}
