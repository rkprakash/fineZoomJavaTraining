package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Java program to sort a numeric arraylist and a string arraylist
 *
 */
public class SortingUseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> inputValue =new ArrayList<Integer>();
		ArrayList<String> inputStr =new ArrayList<String>();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the arraylist size");
		int i,arrSize = scan.nextInt();
		System.out.println("Enter the Arraylist");
		for(i=0;i<arrSize;i++){
			inputValue.add(scan.nextInt());
		}
		Collections.sort(inputValue);
		System.out.println("Sorting Array List");
		System.out.println(inputValue);
		System.out.println("Enter the string value");
		for(i=0;i<arrSize;i++){
			inputStr.add(scan.next());
		}
		Collections.sort(inputStr);
		System.out.println("Sorting String value"+inputStr);
	}

}
