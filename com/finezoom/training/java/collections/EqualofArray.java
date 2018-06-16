package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EqualofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		//List invalue = new List();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the first value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		ArrayList<Integer> inVall = new ArrayList<Integer>();
		System.out.println("Enter the first value");
		for (int i = 0; i < size; i++) {
			inVall.add(scan.nextInt());
		}
		//System.out.println("Print");
		Boolean test =  inVal.equals(inVall);
		if(true){
			System.out.println("There are two array equals");
		}
		else{
			System.out.println("not equal");
		}
	}

}
