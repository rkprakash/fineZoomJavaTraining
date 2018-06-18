package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Addition of two cross two matrix
 *
 */
class AdditionOfTwoMatrix {
	public static void main(String args[]) {
		int[][] inputValuea = new int[2][2];
		int[][] inputValueb = new int[2][2];
		int[][] sum = new int[2][2];
		int len = inputValuea.length;
		int len1 = inputValueb.length;
		int i, j = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First Matrix");
		for (i = 0; i < len; i++) {
			for (j = 0; j < len; j++) {
				inputValuea[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter the Second Matrix");
		for (i = 0; i < len1; i++) {
			for (j = 0; j < len1; j++) {
				inputValueb[i][j] = scan.nextInt();
			}
		}
		System.out.println("Output of program");
		for (i = 0; i < len1; i++) {
			for (j = 0; j < len1; j++) {
				sum[i][j] = inputValuea[i][j] + inputValueb[i][j];
				System.out.println(sum[i][j]);
			}
		}

	}
}