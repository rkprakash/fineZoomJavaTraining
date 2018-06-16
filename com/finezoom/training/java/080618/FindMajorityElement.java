package com.finezoom.training.java.array;

import java.util.Scanner;

/**
 * find majority element ,majority element is greater than n/2 ,n is size
 *
 */
public class FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
		int len=inputValue.length,i,j,count=0;
		int majorVar = len/2;
		//System.out.println(majorVar);
		System.out.println("Enter the input value");
		for (i = 0; i < len; i++) {
			inputValue[i] = scan.nextInt();
		}
		for (i = 0; i < len; i++) {
			for(j=i+1;j<len;j++){
				if(inputValue[i] == inputValue[j]){
					count=count+1;
				}
			}
			
		}
		//System.out.println(count);
		if(count>majorVar){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

}
