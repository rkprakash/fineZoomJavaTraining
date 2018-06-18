package com.finezoom.training.java.array;

import java.util.Scanner;

public class SortPositiveandCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the terms");
		int term = scan.nextInt();
		int[] inputValue = new int[term];
		int i,j=0, max = 0,min=0,maxx=0,count=0;
		int len = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		System.out.println("Positive sort");
		for (i = 0; i < len; i++) {
			if (inputValue[i] > 0) {
				System.out.println(inputValue[i]);
			}
		}
		System.out.println("-----");
		for (i = 0; i < len; i++) {
			for (j = 0; j < len; j++) {
				if (inputValue[i] > inputValue[j]) {
					max = inputValue[i];
					inputValue[i] = inputValue[j];
					inputValue[j] = max;
					min = inputValue[i];
				}
			}
		}
		System.out.println("+++++++++++");
		for (i = 0; i < len; i++) {
			System.out.println(inputValue[i]);
		}
		System.out.println("---------");
		j=0;
		for (i = j; i < len; i=term-1) {
			System.out.println(inputValue[i]);
			i=i+1;
			count++;
			if(count==term){
				break;
			}
		}
		
	}

}
