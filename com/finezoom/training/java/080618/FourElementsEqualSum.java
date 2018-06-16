package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to find all combination of four elements of an given array whose sum is equal to a given value
 *
 */
public class FourElementsEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int j = 0, k, l, i, sum, term;
		System.out.println("Enter the terms");

		term = scan.nextInt();
		int[] inputValue = new int[term];
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Enter the target value");
		sum = scan.nextInt();
		for (i = 0; i < len; i++) {
			for (j = i + 1; j < len; j++) {
				for (k = j + 1; k < len; k++) {
					for (l = k + 1; l < len; l++) {
						if (sum == inputValue[i] + inputValue[j]
								+ inputValue[k] + inputValue[l]) {
							System.out.println("Given element" + inputValue[i]
									+ "," + inputValue[j] + "," + inputValue[k]
									+ "," + inputValue[l]);
						}
					}
				}
			}
		}

	}

}
