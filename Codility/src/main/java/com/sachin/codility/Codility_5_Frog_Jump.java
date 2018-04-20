package com.sachin.codility;

public class Codility_5_Frog_Jump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X = 10;
		int Y = 85;
		int D = 30;
		
		if(Y > X){
            int dividend = (Y-X)/D;
            int remainder = (Y-X)%D;
            if(remainder > 0)
            	dividend++;
            System.out.println(dividend);
        }
        else{
            System.out.println(0);
        }
		/*System.out.println((Y-X)%D);
		System.out.println((Y-X)/D);*/
	}

}
