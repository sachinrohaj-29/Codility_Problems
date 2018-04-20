package com.sachin.codility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =-10;
		fizzbuzz(i);
		
		List<Integer> ll = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
	}

	private static void fizzbuzz(int i) {
		// TODO Auto-generated method stub
		System.out.println(i%3==0 ? "Fizz" : i%5==0 ? "Buzz" : i);
	}
	
}
