package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to find the two elements, their sum is closest to zero.
 *
 */
public class FindTwoElementsSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int term = scan.nextInt();
		int[] inputValue = new int[term];
		int i;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		for (i = 0; i < len; i++) {
			if(inputValue[i] - inputValue[i+1] == 0 || inputValue[i+1] + inputValue[i] == 0){
				System.out.println("Find"+inputValue[i]+","+inputValue[i+1]);
			}
		}
	}

}
