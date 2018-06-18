package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * Java program to create an array of its anti-diagonals from a given square
 * matrix
 *
 */
public class FindAntiDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size");
		int size=scan.nextInt();
		int[][] inputValue = new int[size][size];
		int i = 0, j, k = 0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			for (j = 0; j < k; j++) {

				inputValue[i][j] = scan.nextInt();

			}
			System.out.println();
		}
		System.out.println("-------");
		for (i = 0; i < k; i++) {
			for (j = 0; j < k; j++) {
				if(i==j){
					System.out.println();
					System.out.println(inputValue[i][j]);
				}
				if(i!=j){
					System.out.print(inputValue[i][j]);
				}
				
			}
		}
			
				
			
	}

}
