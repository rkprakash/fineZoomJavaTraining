package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Java program to insert an element (specific position) into an array.
 *
 */
public class InsertElement {

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
		System.out.println("Insrt the element value");
		int insEle = scan.nextInt();
		System.out.println("Insert the position");
		int insPos = scan.nextInt();
		inVal.add(insPos, insEle);
		System.out.println(inVal);
	}

}
