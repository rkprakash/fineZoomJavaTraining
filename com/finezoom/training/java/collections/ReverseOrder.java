package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Java program to reverse an array of integer values
 *
 */
public class ReverseOrder {

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
		System.out.println("Reverse values");
		
		Collections.reverse(inVal);

		System.out.println(inVal);
	}

}
