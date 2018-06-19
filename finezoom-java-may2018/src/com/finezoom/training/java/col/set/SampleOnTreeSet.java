package com.finezoom.training.java.col.set;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Tree set
 *
 */
public class SampleOnTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
	}

	public static void add() {
		TreeSet<Integer> aTree = new TreeSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			aTree.add(scan.nextInt());
		}
		System.out.println("Tree" + aTree);
		aTree.descendingSet(); // decending
		System.out.println("Decending order" + aTree.descendingSet());
		int low =65;
		//lower value from input value
		System.out.println("Lowest element" + aTree.lower(low));
		//highest value from input value
		System.out.println("Hignest element" + aTree.higher(low));
		System.out.println("Remove value");
		int remValue=scan.nextInt();
		aTree.remove(remValue);
		System.out.println("after remove"+aTree);
		
		System.out.println("ceiling"+aTree.ceiling(low));
		System.out.println(""+aTree.pollFirst());
	}
}
