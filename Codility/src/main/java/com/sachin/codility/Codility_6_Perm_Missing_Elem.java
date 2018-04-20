package com.sachin.codility;

public class Codility_6_Perm_Missing_Elem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = {2,5,3,4,7};
		int sum = 0;
        int biggest = 0;
        int lowest = A[0];
        int sumA = 0;
        
        for(int i : A){        	
            sum = sum + i;
            if(i > biggest)
                biggest = i;
            if(i < lowest)
                lowest = i;
        }
        
        sumA = biggest*(biggest+1)/2;
        
        System.out.println("Lowest: " + lowest);
        
        System.out.println(sumA-sum);
	}

}
