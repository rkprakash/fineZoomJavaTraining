package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to check if an array of integers without 0 and -1
 *
 */
public class CheckZeroNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputVal = new int[5];
		int i,len = inputVal.length;
		System.out.println("Enter the input value");
		for(i=0;i<len;i++){
			inputVal[i]=scan.nextInt();
		}
		for(i=0;i<len;i++){
			if(inputVal[i]==0){
				System.out.println("Zero find");
			}
			if(inputVal[i]==(-1)){
				System.out.println("-1 find");
			}
		}
	}

}
