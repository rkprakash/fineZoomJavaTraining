package com.finezoom.training.java.col.llist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Reverse the list
 *
 */
public class ReverseList {
	public void reverse(){
		List<Integer> inputValue = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		// Input list
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		System.out.println("Reverse the order");
		inputValue.retainAll(inputValue);
		System.out.println(inputValue);
	}
}
