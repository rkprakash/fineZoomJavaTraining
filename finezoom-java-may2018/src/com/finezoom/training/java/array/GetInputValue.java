package com.finezoom.training.java.array;

import java.util.Scanner;

public class GetInputValue {
	
	void getInput(){
		Scanner scan = new Scanner(System.in);
		int size1, size2, i, j, temp = 0;
		System.out.println("Enter size of array");
		size1 = scan.nextInt();
		int[] inputVal1 = new int[size1];
		System.out.println("Enter the first array values");
		for (i = 0; i < size1; i++) {
			inputVal1[i] = scan.nextInt();
		}
	}
	    
}
