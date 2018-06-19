package com.finezoom.training.java.col.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashAddFind {
	public void add(){
		Set<Integer > aHash = new HashSet<Integer>();
		Set<Integer> a = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			aHash.add(scan.nextInt());
		}
		//find element
		System.out.println("Enter the find value");
		int find = scan.nextInt();
		boolean status = aHash.contains(find);
		if(status){
			System.out.println("Value found");
		}
		else{
			System.out.println("Not found");
		}
		 
	}
}
