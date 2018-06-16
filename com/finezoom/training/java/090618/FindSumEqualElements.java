package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Find the sum of the two elements of a given array which is equal to a given
 * integer
 *
 */
public class FindSumEqualElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scan.nextInt();
		int[] inputValue = new int[size];
		int i = 0, j, k = 0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Enter the Integer value");
		int sumVal=scan.nextInt();
		System.out.println("Find the value");
		for (i = 0; i < k; i++) {
			if(sumVal==inputValue[i]+inputValue[i+1]){
				System.out.println("The elemnts are"+inputValue[i]+","+inputValue[i+1]);
			}
		}
	}

}
