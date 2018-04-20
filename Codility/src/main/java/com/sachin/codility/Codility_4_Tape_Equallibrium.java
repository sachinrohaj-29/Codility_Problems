package com.sachin.codility;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Codility_4_Tape_Equallibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] A = {3,1,2,4,3};
		int[] A = {-1000,1000};
		System.out.println(getTapeEqualibrium(A));
	}
	
	private static int getTapeEqualibrium(int[] a){
		List<Integer> tapeData = new ArrayList<Integer>();
		int firstHalf = 0;
		for(int i=0; i<a.length-1; i++){			
			int secondHalf = 0;
			firstHalf = a[i] + firstHalf;
			for(int j=i+1; j<a.length; j++){				
				secondHalf = a[j] + secondHalf;
			}
			System.out.println("1stHalf: " + firstHalf + ", 2ndHalf: " + secondHalf + ", Diff: " + (firstHalf-secondHalf));
			tapeData.add(Math.abs(firstHalf-secondHalf));
		}		
		return tapeData.stream().min(Comparator.comparing(Integer::valueOf)).get();
	}

}
