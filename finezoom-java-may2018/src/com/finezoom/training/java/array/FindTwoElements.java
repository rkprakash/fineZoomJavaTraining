package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to check if an array of integers contains two specified elements
 * 65 and 77.
 *
 */
public class FindTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i, n, oneNum=65, secNum=77, temp = 0;

		System.out.println("Enter the number of terms:");
		n = scan.nextInt();
		int[] inputValue = new int[n];
		System.out.println("Enter the value:");
		for (i = 0; i < n; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Check the value"+oneNum+","+secNum);
		
		for (i = 0; i < n; i++) {
			if (oneNum == inputValue[i]) {
				for (i = 0; i < n; i++) {
					if (secNum == inputValue[i]) {
						temp = 1;
						break;
					}
				}				
			}
		}
		if (temp == 1) {
			System.out.println("There are two elements found");

		} else  {
			System.out.println("One element is found");

		} 
	}

}
