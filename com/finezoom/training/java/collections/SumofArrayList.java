package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Sum of Arraylist
 *
 */
public class SumofArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the list");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		int total=0;
		for (int sum : inVal) {
			total+=sum;
		}
		System.out.println("Sum of ArrayList:"+total);
		
	}

}
