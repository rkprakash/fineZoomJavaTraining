package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to find common elements from three sorted (in non-decreasing order) arrays
 *
 */
public class FindCommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term,temp=0,i,len,j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of terms");
		term=scan.nextInt();
		int[] inputValuea = new int[term];
		int[] inputValueb = new int[term];
		int[] inputValuec = new int[term];
		int[] inputValued = new int[term];
		//len = inputValue.length;
		System.out.println("Enter value first array");
		for(i=0;i<term;i++){
			inputValuea[i]=scan.nextInt();
		}
		System.out.println("Enter value second array");
		for(i=0;i<term;i++){
			inputValueb[i]=scan.nextInt();
		}
		System.out.println("Enter value third array");
		for(i=0;i<term;i++){
			inputValuec[i]=scan.nextInt();
		}

		for(i=0;i<inputValuea.length;i++){
			for( j=0;j<inputValueb.length;j++){
				for( int k=0;k<inputValuec.length;k++){
					if(inputValuea[i]==inputValueb[j] && inputValuea[i]== inputValuec[k] && inputValueb[j]==inputValuec[k]){
						System.out.println("common"+inputValuea[i]);
						//temp = 1;
					}					
				}
			}			
		}

	}

}
