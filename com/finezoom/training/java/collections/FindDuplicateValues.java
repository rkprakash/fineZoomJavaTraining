package com.finezoom.training.java.collections;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *Java program to find the duplicate values of an array of integer values
 *
 */
public class FindDuplicateValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		//List invalue = new List();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the value");
		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		 Iterator itr = inVal.iterator();
	       for(int i=0;i<size;i++){

	            int x = (Integer)itr.next();
	           // System.out.println(x);
	         int  y = inVal.indexOf(x);
	          //  System.out.println(y);
	            if (i == y){
	            	itr.remove();
	            }
	       }
	               
	        
	        System.out.println(inVal);
		
	}

}
