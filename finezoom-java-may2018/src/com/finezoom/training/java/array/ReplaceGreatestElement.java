package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to replace every element with the next greatest element from
 * right side
 *
 */
public class ReplaceGreatestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int j = 0, max = 0, min = 0, count = 1, term = scan.nextInt();
		int[] inputValue = new int[term];
		int i;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		// for (i = 1; i < len; i++) {
		// if(inputValue[i]>inputValue[i-1]){
		// inputValue[i-1]=inputValue[i];
		// //inputValue[i]=inputValue[i-1];
		// System.out.println(inputValue[i]);
		// }
		//
		// }
		for (i = 0; i < len; i++) {
			if (inputValue[i] < inputValue[count + 1]) {
				System.out.println(inputValue[count + 1]);
				inputValue[count + 1] = inputValue[i];
			} else if ((inputValue[i] > inputValue[count + 1])) {
				System.out.println(inputValue[i]);
			} else {
				System.out.println(inputValue[i]);
			}
			count = count + 1;

		}
		

	}

}
