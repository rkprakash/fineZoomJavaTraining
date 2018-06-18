package com.finezoom.training.java.col.llist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Remove the element and index
 *
 */

public class RemoveElement {
	public void remove() {
		List<Integer> inputValue = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		// Input list
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		// remove index
		System.out.println("remove the index");
		int remIndex = scan.nextInt();
		inputValue.remove(remIndex);
		System.out.println("After remove the index" + inputValue);
		// remove value
		System.out.println("Remove the value");
		int remValue = scan.nextInt();
		int remValueIndex = inputValue.indexOf(remValue);
		inputValue.remove(remValueIndex);
		System.out.println("After remove elements");
		System.out.println(inputValue);
	}
}
