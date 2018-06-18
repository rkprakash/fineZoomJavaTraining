package com.finezoom.training.java.array;

import java.util.Scanner;

public class RotationCountOnSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
		int[] inputValuea = new int[5];

		int i = 0, j = 0, k = 0, max = 0, min = 0, count = 0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Rotation array");
		for (i = k - 1; i >= 0; i--) {
			
			inputValuea[i] = inputValue[i];
			System.out.println(inputValuea[i]);
		}
		System.out.println("Rotation of sorted array");
		for (i = 0; i < k; i++) {
			for (j = i + 1; j < k; j++) {
				if (inputValue[i] > inputValue[j]) {
					max = inputValue[i];
					inputValue[i] = inputValue[j];
					inputValue[j] = max;

				}
			}
		}
		for (i = 0; i < k; i++) {
			System.out.println(inputValue[i]);
		}
		
			for (j = 0; j < k; j++) {
				if (inputValuea[j] == inputValue[j]) {
					count = count + 1;
				}else{
					j++;
				}
		
		}
		System.out.print("Count :" + count);
	}

}
