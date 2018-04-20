package com.sachin.codility;

public class Recursion_Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit = 7;
				
		System.out.println(getFibonacci(limit));
	}

	private static int getFibonacci(int n){		
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else{
			return getFibonacci(n-1) + getFibonacci(n-2);
		}
	}
}
