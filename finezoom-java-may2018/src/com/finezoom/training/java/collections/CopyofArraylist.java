package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java program to copy an array by iterating the array
 *
 */
public class CopyofArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		Object newVal = new ArrayList<Integer>();
		System.out.println("Enter the value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		System.out.println("New arraylist");
		newVal=inVal.clone();
		System.out.println(newVal);
	}

}
