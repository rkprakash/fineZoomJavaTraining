package com.finezoom.training.java.array;

import java.util.Scanner;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		
		int size,i=0,temp=0;
				
		
		System.out.println("Enter terms");
		size=scan.nextInt();
		System.out.println("Enter input value");
		String inputValue[] = new String[size];
		for(i=0;i<size;i++){
			inputValue[i] = scan.next();			
		}
		
		System.out.println("Duplicate value");
		for( i=0;i<inputValue.length;i++){
			for(int j=i+1;j<inputValue.length;j++){
				if(inputValue[i].equals(inputValue[j]))
				{
					String value=inputValue[j];
					System.out.println("Duplicate Array is "+value+", position"+i+","+j);
				}
			}
		
		}

	}

}
