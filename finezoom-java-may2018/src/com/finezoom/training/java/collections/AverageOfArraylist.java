package com.finezoom.training.java.collections;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Average program
 *
 */
public class AverageOfArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inputVal = new ArrayList<Integer>();
		int i, arrSize,avg=0,total=0;
		System.out.println("Array Size:");
		Scanner scan = new Scanner(System.in);
		arrSize = scan.nextInt();
		System.out.println("Enter the values");
		for (i = 0; i < arrSize; i++) {
			inputVal.add(scan.nextInt());
		}

		for (Integer sum : inputVal) {
			total+=sum;
			//
		}
		avg = (total/arrSize);
		System.out.println("Average of Arraylist : "+avg);
	}

}
