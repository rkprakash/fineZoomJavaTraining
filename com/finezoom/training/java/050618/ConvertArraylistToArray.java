package com.finezoom.training.java.array;

import java.util.ArrayList;

/**
 * Arraylist to Array
 *
 */
public class ConvertArraylistToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println("Arraylist to array");
		Object[] objects = al.toArray();
		for (Object obj : objects){
			System.out.print(obj + " ");
		}
		 

	}

}
