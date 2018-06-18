package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * remove duplicate elements from an array.
 *
 */
public class DuplicateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
	}

}
