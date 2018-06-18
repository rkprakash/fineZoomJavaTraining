package com.finezoom.training.java.array;

import java.util.Scanner;

public class FindUniqueTriplets {

	/**
	 * find all the unique triplets such that sum of all the three elements
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int term, i,  j;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of terms");
		term = scan.nextInt();
		int[] inputValuea = new int[term];
		int[] inputValueb = new int[term];
		int[] inputValuec = new int[term];
		System.out.println("Enter value first array");
		for (i = 0; i < term; i++) {
			inputValuea[i] = scan.nextInt();
		}
		System.out.println("Enter value second array");
		for (i = 0; i < term; i++) {
			inputValueb[i] = scan.nextInt();
		}
		System.out.println("Enter value third array");
		for (i = 0; i < term; i++) {
			inputValuec[i] = scan.nextInt();
		}
		System.out.println("Enter value target");
		int targetVal = scan.nextInt();

		for (i = 0; i < inputValuea.length; i++) {
			for (j = i; j < inputValueb.length; j++) {
				for (int k = j; k < inputValuec.length; k++) {
					if (targetVal == inputValuea[i] + inputValueb[j]
							+ inputValuec[k]) {
						System.out.println("equal of elemtns value "
								+ inputValuea[i] + "," + inputValueb[j] + ","
								+ inputValuec[k]+"position of "+i+","+j+","+k);
					}

				}
			}
		}
	}

}
