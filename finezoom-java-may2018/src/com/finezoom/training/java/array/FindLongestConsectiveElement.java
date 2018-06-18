package com.finezoom.training.java.array;

import java.util.Scanner;

public class FindLongestConsectiveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
		int i,j,len = inputValue.length,max=0;
		System.out.println("Enter the array values");
		for ( i = 0; i < inputValue.length; i++) {
			inputValue[i]=scan.nextInt();
		}
//		SortingArray sArray =new SortingArray();
//		soar.display();
		for( i=0;i<len;i++){
			for( j=i+1;j<len;j++){			
			if(inputValue[i]>inputValue[j]){				
				max = inputValue[i];		
                inputValue[i]=inputValue[j];
                 inputValue[j]=max;				
				}						
			}			
		}
		System.out.println("Consective array");
		for( i=0;i<=len-1;i++){
			//System.out.println("Maximum Number :"+inputValue[i]);
			if(1 == inputValue[i+1]-inputValue[i]){
				System.out.println(inputValue[i]);
				inputValue[i] = inputValue[i+1];
				System.out.println(inputValue[i]);
				
				//System.out.println(inputValue[i+1]);
			}
		}
	}

}
