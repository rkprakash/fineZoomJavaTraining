package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to arrange the elements of an given array of integers where all
 * negative integers appear before all the positive integers.
 *
 */
public class ArrangePositiveNegative {

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
		System.out.println("Arrange the positive and negative");
		for (i = 0; i < inputValue.length; i++) {
			if (inputValue[i] > 0) {
				System.out.println(inputValue[i]);
			}
		}
		for (i = 0; i < inputValue.length; i++) {
			if (inputValue[i] < 0) {
				System.out.println(inputValue[i]);
			}
		}

	}

}
