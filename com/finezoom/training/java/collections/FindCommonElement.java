package com.finezoom.training.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class FindCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("Enter the size");
		size= scan.nextInt();
		System.out.println("Enter the first array");
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		System.out.println("Enter the second array");
		ArrayList<Integer> inVal2 = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			inVal2.add(scan.nextInt());
		}
		System.out.println("Enter the third array");
		ArrayList<Integer> inVal3 = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			inVal3.add(scan.nextInt());
		}
		System.out.println("Sorting array");
		Collections.sort(inVal);
		System.out.println(inVal);
		Collections.sort(inVal2);
		System.out.println(inVal2);
		Collections.sort(inVal3);
		System.out.println(inVal3);

	}
	

}
