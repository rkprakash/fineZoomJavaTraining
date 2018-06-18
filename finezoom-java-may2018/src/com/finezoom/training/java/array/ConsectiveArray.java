package com.finezoom.training.java.array;

import java.util.Scanner;

public class ConsectiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];

		int i = 0, k = 0, j = 0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			inputValue[i] = scan.nextInt();
		}

		for (i = 0; i < k; i++) {
			
				if (inputValue[i] == inputValue[i+1]) {
					// System.out.println("dup"+inputValue[j]);
					inputValue[i] = inputValue[i+1];
					i++;
				}
			//	System.out.println(inputValue[i]);
			
			System.out.println("d"+inputValue[i]);

		}

	}

}
