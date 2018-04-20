package com.sachin.codility;

import java.util.ArrayList;

public class Codility_2_Array_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {3, 8, 9, 7, 6};
		int K = 3;		
        while(K>0 && A.length>0){
            A = rotate(A);
            K--;
        }
        
        for(int i: A){
        	//System.out.println(i);
        }
        
        ArrayList<Integer> ll = new ArrayList<Integer>();
        
        for(int i=0; i<10; i++){
        	ll.add(i);
        }
        
        //for(int i=0; i<10; i++){
        for(int i: ll){
        	ll.add(i+10);
        }
        ll.stream().forEach(System.out::println);
        
	}

	private static int[] rotate(int[] b) {
		// TODO Auto-generated method stub
		int[] c = new int[b.length];
		c[0] = b[b.length-1]; 
		for(int i=1; i<b.length; i++){		
			c[i]=b[i-1];
		}
		return c;
	}
	
	

}
