package com.finezoom.training.java.array;

import java.util.Scanner;

public class PairofSumRotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int term = scan.nextInt();
		int[] inputValue = new int[term];
		int i,j=0,k,max=0,count=0;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}System.out.println("Enter the sum value");
		int sum=scan.nextInt();
		System.out.println("Enter your Choice\n1:SortArray\n2:RotateArray");
		
		int ch = scan.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Sorted Array ");
			for( i=0;i<len;i++){
				for( j=i+1;j<len;j++){			
				if(inputValue[i]>inputValue[j]){				
					max = inputValue[i];		
	                inputValue[i]=inputValue[j];
	                 inputValue[j]=max;				
					}						
				}			
			}			
			for (i = 1; i < len; i++) {
				//System.out.println(inputValue[i]);
				if(sum==inputValue[i]+inputValue[i-1]){
					System.out.println("Pair elements of "+inputValue[i]+","+inputValue[i-1]);
					count = count+1;
				}			
			}
			if(count==0){
				System.out.println("No elements");
			}
			break;
		case 2:
			System.out.println("Rotate array :");
			for (i = len-1; i >= 0; i--) {	
				System.out.println(inputValue[i]);
			}
			for (i = len-1; i >= 0; i--) {		
				if(i==0){
					break;
				}
				if(sum==inputValue[i]+inputValue[i-1]){
					System.out.println("Pair elements of "+inputValue[i]+","+inputValue[i-1]);
				}
			}
			break;
		default:
			System.out.println("Check Value");
			break;
		}
		
		
	}

}
