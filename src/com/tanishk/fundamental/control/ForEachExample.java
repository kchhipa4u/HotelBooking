package com.tanishk.fundamental.control;

public class ForEachExample {
	
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int sumAdv =0;
		
		// Normal for loop
		for(int i=0; i < nums.length; i++)
		{
			sum = sum + nums[i];
		}
		
		System.out.println("Count using normal for loop " + sum);
		
		/*for (int i : nums) {
			sumAdv = sumAdv + nums[i];
		}
		
		System.out.println("Count using normal for loop " + sumAdv);*/
	}

}
