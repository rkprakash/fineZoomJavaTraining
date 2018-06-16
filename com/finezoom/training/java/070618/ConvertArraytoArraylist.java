package com.finezoom.training.java.array;


import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Convert array to arraylist
 *
 */
public class ConvertArraytoArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputVal = new int[5];
		Scanner scan = new Scanner(System.in);
		int[] inputVal = new int[5];
		int i,len = inputVal.length;
		System.out.println("Array ");
		for( i=0;i<len;i++){
			inputVal[i]=scan.nextInt();
		}
		System.out.println("Array to Arraylist");
		ArrayList<Integer> listArr = new ArrayList<Integer>();
		for (int j : inputVal) {
			listArr.add(j );
		}
		System.out.println(listArr.toString());
	}

}
