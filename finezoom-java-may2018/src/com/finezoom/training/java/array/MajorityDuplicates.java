package com.finezoom.training.java.array;

import java.util.Scanner;

public class MajorityDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
		
		int i;
		
		int reverseValue[]=new int[5];
		int len=reverseValue.length;
		System.out.println(len);
		int j=0;
		System.out.println("Enter the input Values");		
		for( i=0;i<len;i++){
			
			reverseValue[i]=scan.nextInt();	
			
		}	

	}

}
