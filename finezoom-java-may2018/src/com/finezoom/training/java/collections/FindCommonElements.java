package com.finezoom.training.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 * Java program to find the common elements between two arrays
 *
 */
public class FindCommonElements {
	public void get(){
		
	}
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt(), max = 0, min = 0, minn = 0;
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		ArrayList<Integer> inVala = new ArrayList<Integer>();
		System.out.println("Enter the first value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		System.out.println("Enter the second value");
		for (int i = 0; i < size; i++) {
			inVala.add(scan.nextInt());
		}
		Set keySet(inVal,inVala);
		
		

	}
}
