package com.finezoom.training.java.array;

import java.util.Arrays;
import java.util.Scanner;

public class RotationCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arrayVal[] = new int[scan.nextInt()];
		int nums[] = new int[scan.nextInt()];
		int count = 0;
		for (int i = 0; i < arrayVal.length; i++) {
			count++;
			System.out.println("Enter the" + count + " element of array");
			arrayVal[i] = scan.nextInt();

		}
		int temp, previous,k;
        for (int i = 0; i <nums.length; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }     
 System.out.println(Arrays.toString(nums));       
 }
		//IntegerUtils.rotate(arrayVal,1);
	}


