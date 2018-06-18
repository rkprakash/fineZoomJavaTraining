package com.finezoom.training.java.col.llist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Find elements with two list
 *
 */
public class FindTwoList {
	public void findElements() {
		List<Integer> inputValue = new LinkedList<Integer>();
		List<Integer> aninputValue = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		// Input list
		System.out.println("Enter the first input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		System.out.println("Enter the second input value");
		for (int i = 0; i < size; i++) {
			aninputValue.add(scan.nextInt());
		}
		// Two list Equality
		Boolean status;
		status = inputValue.equals(aninputValue);
		System.out.println(status);

		// Common elements from common index
		Iterator<Integer> itr = inputValue.iterator();
		Iterator<Integer> itrr = aninputValue.iterator();
		while (itr.hasNext()) {
			Integer val = itr.next();
			if (val == itrr.next()) {
				System.out.println(val);
			}
		}
		// Common elements
		for (Integer test : aninputValue) {
			for (Integer testt : inputValue) {
				if (test == testt) {
					System.out.println(testt);
				}
			}
		}

	}
}
