package com.finezoom.training.java.col.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveHash {
	public void insert() {
		Set<Integer> aHash = new HashSet<Integer>();
		Set<Integer> a = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			aHash.add(scan.nextInt());
		}
		System.out.println("Enter the remove value");
		int remValue = scan.nextInt();
		aHash.remove(remValue);
		System.out.println(aHash);
		
	}
}