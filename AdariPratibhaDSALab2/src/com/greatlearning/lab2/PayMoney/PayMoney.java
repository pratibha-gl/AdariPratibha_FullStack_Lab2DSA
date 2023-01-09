package com.greatlearning.lab2.PayMoney;
import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("How many days you wants to keep track/enter the size of transaction array");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the daily transactions into transaction array");
		for (int i = 0; i < arr.length; i++ ) {
		
		 arr[i] = in.nextInt();
	}
	
	System.out.println("Enter the total number of targets that needs to be achieved");
	int targetNumber = in.nextInt();
	while(targetNumber-- !=0)
	{
		int flag = 0;
		long targetValue;
		long sum = 0;
		System.out.println("Enter the value of target");
		targetValue = in.nextLong();
		for (int i =0; i < size; i ++) {
			sum = sum +arr[i];
			if (sum >= targetValue) {
				System.out.println("Target value achived after" + (i + 1)+ "transactions..");
			    flag = 1;
			    break;
			}
		}
		if (flag == 0) {
			System.out.println("Given target amount is not achieved");
		    }
	    }
	}
	
}
	
