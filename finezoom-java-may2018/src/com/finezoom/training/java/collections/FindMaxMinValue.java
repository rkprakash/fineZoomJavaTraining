package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Java program to find the maximum and minimum value of an array
 *
 */
public class FindMaxMinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt(), max = 0, min = 0,minn=0;
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
//		Collections.min(inVal);
//		Collections.max(inVal);
		System.out.println("Maximun Value"+Collections.max(inVal));
		System.out.println("Minimun value"+Collections.min(inVal));
	}

}
