package com.tanishk.commonthings;

public class ArrayDemo {
	
	public static void main(String[] args) {
		int[] items = {10, 20, 30, 40, 50, 60, 70, 80};
		
		System.out.println(items[6]);
		System.out.println(items.length);
		
		int x = 0;
		int sum = 0;
		while(x < items.length){
			sum=sum + items[x];
			x++;
			
		}
		System.out.println(sum);
		
		// Other way to perform same program using for loop
		
		int newSum=0;
		for(int y=0; y < items.length; y++)
		{
			newSum=newSum + items[y];
		}
		
		System.out.println(newSum);
		
	}

}
