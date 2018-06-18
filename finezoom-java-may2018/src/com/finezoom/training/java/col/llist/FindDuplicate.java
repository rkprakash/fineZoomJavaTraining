package com.finezoom.training.java.col.llist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindDuplicate {
	public void duplicate() {
		List<Integer> inputValue = new LinkedList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		System.out.println("Find the duplicate value");
		inputValue.equals(inputValue);
		System.out.println(inputValue);
	}

}
