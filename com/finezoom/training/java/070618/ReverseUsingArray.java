package com.finezoom.training.java.array;

import java.util.Scanner;


/**
 *  java program to reverse number to array
 *
 */
class ReverseUsingArray{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		
		int i,reminder=0,quotient=0;
		
		int reverseValue[]=new int[5];
		int len=reverseValue.length;
		System.out.println(len);
		int j=0;
		System.out.println("Enter the input Values");		
		for( i=0;i<len;i++){
			reverseValue[i]=scan.nextInt();	
			
		}	
		
		//System.out.println(quotient);
		System.out.println("Reverse array");
		for( i=0;i<len;i++){
			quotient=reverseValue[i];
		while( j<quotient) {
			
				 reminder = quotient%10;
				 quotient = quotient/10;
				 System.out.print(reminder);	
				
		}
		 System.out.println();
		}
		
	}
}