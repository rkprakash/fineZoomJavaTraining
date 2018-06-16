package com.finezoom.training.java.array;

import java.util.Scanner;

public class RemoveDuplicateWithoutLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] inputValue = new int[5];
	
		int  i = 0, k = 0, j = 0,count=1,max=0;
		k = inputValue.length;
		System.out.println("Enter the input value");
		for (i = 0; i < k; i++) {
			inputValue[i] = scan.nextInt();
		}
		for( i=0;i<k;i++){
			for( j=i+1;j<k;j++){			
			if(inputValue[i]>inputValue[j]){				
				max = inputValue[i];		
                inputValue[i]=inputValue[j];
                 inputValue[j]=max;				
				}						
			}			
		}
		for(i=1;i<k;i++){
			if(inputValue[i]!=inputValue[count-1]){
				inputValue[count++]=inputValue[i];
				//System.out.println(inputValue[i]);
				//count =count+1;
			}
		}
		
		System.out.println(count);

		

	}

}
