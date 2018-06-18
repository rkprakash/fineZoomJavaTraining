package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to test the equality of two arrays
 *
 */
public class FindTwoEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size1, size2, i, j, temp = 0;
		System.out.println("Enter size of array");
		size1 = scan.nextInt();
		int[] inputVal1 = new int[size1];
		System.out.println("Enter the first array values");
		for (i = 0; i < size1; i++) {
			inputVal1[i] = scan.nextInt();
		}
		System.out.println("Enter size of array");
		size2 = scan.nextInt();
		int[] inputVal2 = new int[size2];
		System.out.println("Enter the second array values");
		for (i = 0; i < size2; i++) {
			inputVal2[i] = scan.nextInt();
		}
		if (size1 != size2) {
			System.out.println("There are two array size is not equal");
		} else {
			for (i = 0; i < size1; i++) {
				if (inputVal1[i] == inputVal2[i]) {
					temp = 1;
				} else {
					temp = 0;
				}
			}
			if (temp == 1) {
				System.out.println("Both array element is equal");
			} else {
				System.out.println("not equal");
			}
		}

	}

}
