package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to move all 0's to the end of an array. Maintain the relative
 * order of the other (non-zero) array elements
 *
 */
public class ZeroEndArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] inputVal=new int[5];
		int i;
		System.out.println("Enter the array values");
		for ( i = 0; i < inputVal.length; i++) {
			inputVal[i] = scan.nextInt();
		}
		
		for (int j : inputVal) {
			if(j%10!=0){
				System.out.println(j);
			}
		}
		for (int j : inputVal) {
			if(j%10==0){
				System.out.println(j);
			}
		}
	}

}
