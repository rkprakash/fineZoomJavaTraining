package com.finezoom.training.java.col.llist;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *Find minimum and maximum of value
 *
 */
public class MaximunMinimum {
	public void largesmall() {
		List<Integer> inputValue = new LinkedList<Integer>();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = scan.nextInt();
		// Input list
		System.out.println("Enter the input value");
		for (int i = 0; i < size; i++) {
			inputValue.add(scan.nextInt());
		}
		//Max and min
		System.out.println("Maximum value"+Collections.max(inputValue));
		System.out.println("Minimum value"+Collections.min(inputValue));
		
		//second max & min
		int maxInvalue = Collections.max(inputValue);
		int minValue = Collections.min(inputValue);
		Iterator<Integer> itr = inputValue.iterator();
		List< Integer> secMax = new LinkedList<Integer>();
		while(itr.hasNext()){
			Integer secInval = itr.next();
			if(secInval < maxInvalue){
					secMax.add(secInval);
			}
			
		}
		int s= secMax.indexOf(minValue);
		secMax.remove(s);
		System.out.println("Second Maximun Value"+Collections.max(secMax));
		System.out.println("Second Minimun Value"+Collections.min(secMax));
	}

}
