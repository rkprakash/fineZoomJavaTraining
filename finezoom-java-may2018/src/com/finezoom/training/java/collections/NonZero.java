package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt();
		List<Integer> listNumbers = new ArrayList<Integer>();
		System.out.println("Arraylist");
		for (int i = 0; i <size; i++) {
			listNumbers.add(scan.nextInt());
		}
		int index = 0;
		//Object o;
		for (Integer o : listNumbers) {
			if(0== o%10){
				listNumbers.remove(o);
			}
			
		}
		System.out.println(listNumbers);
		//listNumbers.remove(index%10);
		
	}

}
