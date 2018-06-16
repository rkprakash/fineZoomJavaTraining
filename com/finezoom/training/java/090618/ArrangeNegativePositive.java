package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * java program for Arrange negative , positive
 *
 */
public class ArrangeNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
		int i = 0, k = 0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Arrange the negative and positive  ");
		for (i = 0; i < inputValue.length; i++) {
			if (inputValue[i] < 0) {
				System.out.println(inputValue[i]);
			}
		}
		for (i = 0; i < inputValue.length; i++) {
			if (inputValue[i] > 0) {
				System.out.println(inputValue[i]);
			}
		}
	}

}
