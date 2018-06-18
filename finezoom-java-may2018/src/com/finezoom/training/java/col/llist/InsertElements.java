package com.finezoom.training.java.col.llist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Insert the index
 *
 */
public class InsertElements {
	public void insertElement(){
		List<Integer> inputValue = new LinkedList<Integer>() ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		//find element
		System.out.println("Enter the insert value");
		int insValue = scan.nextInt();
		System.out.println("Enter the index value");
		int indexValue = scan.nextInt();
		inputValue.add(indexValue, insValue);
		System.out.println("After insert the value");
		for (Integer testValue : inputValue) {
			System.out.println(testValue);
		}
	}
	
}
