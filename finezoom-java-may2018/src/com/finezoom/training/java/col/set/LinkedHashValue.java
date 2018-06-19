package com.finezoom.training.java.col.set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Linked hash set using add,delete
 *
 */
public class LinkedHashValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

	public static void add() {
		LinkedHashSet<Integer> aHash = new LinkedHashSet<Integer>();
		// Set<Integer> a = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			aHash.add(scan.nextInt());
		}
		System.out.println("LinkedHashSet:" + aHash);
		int a = aHash.size();
		
		System.out.println("Size of LinkedHashSet = " + aHash.size());
		
		//remove
		System.out.println("Remove the value");
		int remValue = scan.nextInt();
		aHash.remove(remValue);
		System.out.println("Removing  LinkedHashSet: "
				+ aHash.remove(remValue));
		
		//find
		System.out.println("Find the value");
		int findValue=scan.nextInt();
		System.out.println("Find="
				+ aHash.contains(findValue));
		
	}
}
