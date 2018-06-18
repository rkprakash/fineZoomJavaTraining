package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to find smallest and second smallest elements of a given array
 *
 */
public class FindSmallandSecond {

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int max = 0, j = 0, min = 0, term = scan.nextInt();
		int[] inputValue = new int[term];
		int i;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}

		for (i = 0; i < len; i++) {
			for (j = 0; j < len; j++) {
				if (inputValue[i] > inputValue[j]) {
					max = inputValue[i];
					inputValue[i] = inputValue[j];
					inputValue[j] = max;
				}
			}

		}
		System.out.println("Small value" + inputValue[len - 1]);
		System.out.println("Second small value" + inputValue[len - 2]);
	}

}
