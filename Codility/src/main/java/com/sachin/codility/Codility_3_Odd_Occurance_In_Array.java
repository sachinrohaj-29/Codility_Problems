package com.sachin.codility;

import java.util.HashMap;
import java.util.Map;

public class Codility_3_Odd_Occurance_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {1,2,3,2,4,1,3};
		System.out.println(getOddElement(A));
	}
	
	private static int getOddElement(int[] a){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int addNumber=0;
		for(int i : a){			
			if(map.containsKey(i)){
				 map.put(i, map.get(i)+1); 
			}
			else{
				map.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> es : map.entrySet()){
			// this is really important as if we write only "es.getValue() == 1" then this will check only for 1 not for the odd numbers. 
			if(es.getValue()%2 == 1)
				addNumber = es.getKey();
		}
		
		return addNumber;
	}

}
