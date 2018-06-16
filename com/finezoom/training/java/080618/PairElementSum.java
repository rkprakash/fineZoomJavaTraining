package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to find all pairs of elements in an array whose sum is equal to
 * a specified number
 *
 */
public class PairElementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size1, size2, i, j, temp;
		System.out.println("Enter size of array");
		size1 = scan.nextInt();
		int[] inputVal1 = new int[size1];
		System.out.println("Enter the array values");
		for (i = 0; i < size1; i++) {
			inputVal1[i] = scan.nextInt();
		}
		System.out.println("Enter sum of pair values");
		temp = scan.nextInt();
		for (i = 0; i < size1; i = i + 2) {
			size2 = inputVal1[i] + inputVal1[i + 1];
			// System.out.println(size2);
			if (temp == size2) {
				System.out.println("Pair elements of " + i + "," + (i + 1));
				// i++;
			}
		}

	}
}
