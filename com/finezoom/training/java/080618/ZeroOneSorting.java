package com.finezoom.training.java.array;

import java.util.Scanner;

public class ZeroOneSorting {

	/**
	 * Java program to separate 0s on left side and 1s on right side
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int j = 0,max=0, term = scan.nextInt();
		int[] inputValue = new int[term];
		int i;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Series of 0 & 1");
		for(i=0;i<len;i++){
			if(inputValue[i]%10 == 0){
				System.out.println(inputValue[i]);
			}
		}
		for(i=0;i<len;i++){
			if(inputValue[i]%10 == 1){
				System.out.println(inputValue[i]);
			}
		}
		for(i=0;i<len;i++){
			if(inputValue[i]%10 != 1 && inputValue[i]%10 != 0){
				System.out.println(inputValue[i]);
			}
		}
	}

}
