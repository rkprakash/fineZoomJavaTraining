package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to cyclically rotate a given array clockwise by one
 *
 */
public class RotateClockwiseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size,i;
		System.out.println("Enter the size of array");
		size=scan.nextInt();
		int[] inputValue = new int[size];
		int[] assignValue =new int[size];
		System.out.println("Enter array value");
		for(i=0;i<size;i++){
			inputValue[i]=scan.nextInt();
		}
		System.out.println("Clockwise Array");
		for(i=size-1;i>=0;i--){
			System.out.println(inputValue[i]);
		}
	}

}
