package com.finezoom.training.java.array;

import java.util.Scanner;
class AverageWithoutLargeSmall{
	public static void main(String args[]){
		Scanner scan =new Scanner(System.in);
		int[] inputValue=new int[5];
		int i=0,j=0,k=0,max=0,min=0,temp=0;
		k=inputValue.length;
		System.out.println(k);
		System.out.println("Enter the input value");
		for(i=0;i<k;i++){
			inputValue[i] = scan.nextInt();
			//System.out.print(a[i]);
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
		
		for( i=1;i<=k-2;i++){
			temp=temp+inputValue[i];			
		}
		temp = (temp/(k-2));
		System.out.println("Average"+temp);
		
	}
}