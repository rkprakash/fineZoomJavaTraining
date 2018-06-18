package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ava program to test if an array contains a specific value
 *
 */
public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> inValue = new ArrayList<Integer>();
		System.out.println("Enter the arraylist");
		for (int i = 0; i < 5; i++) {
			inValue.add(scan.nextInt());
		}
		System.out.println("Find the value");
		int count = 0, findVal = scan.nextInt();
		for (Integer test : inValue) {
			if (test == findVal) {
				count =1;
			} 
		}if(count==1){
			System.out.println("This element is find");
		}else{
			System.out.println("Not find");
		}
		
	}

}
