package com.finezoom.training.java.array;

import java.util.Scanner;

class InsertArray{
	public static void main(String args[]){
		int inputValue[] = new int[5];
		int insValue,i=0,k=0,j=0;
		int inssValue[] = new int[1];
		k=inputValue.length;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input value");
		for(i=0;i<k;i++){
			inputValue[i] = scan.nextInt();			
		}
		System.out.println("Enter the insert position");
		insValue = scan.nextInt();
		System.out.println("Enter the insert value");
		inssValue[j] = scan.nextInt();
		System.out.println("After the add element");
		for( i=0;i<k;i++){
			if(i==insValue){
				//inputValue[i] = inputValue[i+1] ;
				//int tem = inputValue[i];
				inputValue[i] = inssValue[j];
				//inputValue[i++] =tem;
				//i++;
			}		
			System.out.println(inputValue[i]);
		}
	}
}