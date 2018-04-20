package com.sachin.codility;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Codility_binary_gap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 9;
		String binary = getBinary(N);
		System.out.println(binary);
		Map<Integer,Integer> sequnceMap = getSequence(binary);
		System.out.println(sequnceMap);
		
		int max = sequnceMap.values().stream().max(Comparator.comparing(Integer::valueOf)).get();
		//int max = getMaxGap(sequnceMap);		
		System.out.println(max);
	}

	private static int getMaxGap(Map<Integer,Integer> sequnceMap){
		int max=0;
		
		for(int val : sequnceMap.values()){
			if(val > max)
				max=val;
		}
		
		/*for(Map.Entry<Integer,Integer> entry : sequnceMap.entrySet()){
			if(entry.getValue() > max)
				max=entry.getValue();
		}*/
		return max;
	}
	
	private static Map<Integer,Integer> getSequence(String binary){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sequence = 0;
		int j=0;
		for(int i=j; i<binary.length(); i++){
			int count = 0;		
			if(binary.charAt(i) == '1'){
				sequence++;				
				for(j=i+1; j<binary.length(); j++){					
					if(binary.charAt(j) == '0'){
						count++;
					}
					else{
						map.put(sequence, count);
						break;
					}
				}
			}
		}
		return map;		
	}
	
	private static String getBinary(int N){
        int quotient;
        int remainder;
        int divisor=2;
        StringBuffer binary = new StringBuffer();        
        quotient = N;        
        while(quotient != 0 ){
        	remainder = quotient%divisor;
        	quotient = quotient/divisor;        	
            binary.append(remainder);
        }        
        return binary.toString();
    }
}
