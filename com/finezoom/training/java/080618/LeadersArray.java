package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * print all the LEADERS in the array,greater than right side
 *
 */
public class LeadersArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
		int i;
		System.out.println("Enter the array values");
		for ( i = 0; i < inputValue.length; i++) {
			inputValue[i]=scan.nextInt();
		}
		for ( i = 0; i < inputValue.length; i++) {
			if(inputValue[i]<inputValue[i+1]){
				System.out.println(inputValue[i+1]);
			}
		}

	}

}
