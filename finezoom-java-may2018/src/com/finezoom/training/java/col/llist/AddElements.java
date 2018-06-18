package com.finezoom.training.java.col.llist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddElements {
	public static void listElement() {
		
		List<Integer> inputValue = new LinkedList<Integer>() ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		//find element
		System.out.println("Enter the find value");
		int find = scan.nextInt();
		boolean status = inputValue.contains(find);
		 
        if(status)
            System.out.println("this element find ");
        else
            System.out.println("not find");
		
	}
}
