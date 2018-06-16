package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to separate even and odd numbers of an given array of integers.
 * Put all even numbers first, and then odd numbers
 *
 */
public class EvenOddSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inValue = new int[5];
		int i,len=inValue.length;
		System.out.println("Enter the value");
		for (i = 0;  i< inValue.length; i++) {
			inValue[i]=scan.nextInt();
		}
		System.out.println("Series of even & odd");
		for (i = 0;  i< inValue.length; i++) {
			if(inValue[i]%2==0){
				System.out.println(inValue[i]);
			}
		}
		for (i = 0;  i< inValue.length; i++) {
			if(inValue[i]%2!=0){
				System.out.println(inValue[i]);
			}
		}
	}

}
