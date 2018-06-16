package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		// List invalue = new List();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the value");

		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		int maxNum = Collections.max(inVal);
		inVal.indexOf(maxNum);
		for (Integer test : inVal) {
			if(test < maxNum){
				int min = maxNum;
				maxNum = test;
				test = min;
			}
			System.out.println("Second"+maxNum);
		}
	}
}
