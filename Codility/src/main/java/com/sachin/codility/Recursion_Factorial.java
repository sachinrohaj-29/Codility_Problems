package com.sachin.codility;

public class Recursion_Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 5;
		System.out.println(getFactorial(no));
	}
	
	private static int getFactorial(int n){
		int factorial;
		if(n == 1){
			return 1;
		}
		else{
			factorial = getFactorial(n-1)*n;
		}
		return factorial;
	}

}
