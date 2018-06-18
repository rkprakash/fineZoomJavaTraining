package com.finezoom.training.java.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class FindPairElementEqualSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of arrays");
		int size = scan.nextInt(),sum =11;
		// List invalue = new List();
		ArrayList<Integer> inVal = new ArrayList<Integer>();
		System.out.println("Enter the value");

		for (int i = 0; i < size; i++) {
			inVal.add(scan.nextInt());
		}
		for (int i = 0; i < size; i++) {
			if(sum == inVal.get(i)+inVal.get(i+1) ){
				System.out.println(sum);
			}
			if(i==size-2){
				break;
			}
		}
		
	}

}
