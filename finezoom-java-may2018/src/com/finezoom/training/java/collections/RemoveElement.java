package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java program to remove a specific element from an array
 *
 */
public class RemoveElement {

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
		System.out.println("Enter the value");
		int remval=scan.nextInt();
		int indexVal = inVal.indexOf(remval);
		inVal.remove(indexVal);
		System.out.println("After the remove elemnts");
		System.out.println(inVal);
	}

}
