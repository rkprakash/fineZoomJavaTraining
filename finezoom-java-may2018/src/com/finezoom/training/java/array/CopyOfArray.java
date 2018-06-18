package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to copy an array by iterating the array
 *
 */
public class CopyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputVal=new int[6];
		Scanner scan = new Scanner(System.in);
		int i =0;
		int len = inputVal.length;
		System.out.println("Enter the input value");
		for(i=0;i<len;i++){
			inputVal[i]=scan.nextInt();			
		}
		System.out.println("iterating Array");
		for (int iterVal : inputVal) {
			System.out.println(iterVal);
		
		}
		

	}

}
