package com.fundamentals.collectionapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           System.out.println("--------add element to end of list");
           arrayList.add(0,"kanhaiya");
           arrayList.add(1, "chhipa");
           arrayList.add(2, "Tanishk");
           
           
           arrayList.add(3, "abc");
           arrayList.add(null);
           arrayList.add(null);
           
           arrayList.set(1, "Rohit");
           
           /*for (String string : arrayList) {
			System.out.println(string);
		  }*/
           
           Iterator<String> iterator = arrayList.iterator(); 
           while(iterator.hasNext())
           {
        	   System.out.println(iterator.next());
        	   
           }
           
           arrayList.add("xyz");
           
           /*System.out.println(arrayList.get(2));
 
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("--------add element at 1st index i.e. after ankit");
           arrayList.add(1,"java");
           System.out.println("arrayList = "+arrayList);
           
           List<String> arrayList1 = new ArrayList<>();
           
           arrayList1.addAll(arrayList);
           arrayList1.add("def");
           
           System.out.println("arrayList1 = "+arrayList1);*/
    }
}
