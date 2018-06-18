package com.finezoom.training.java.array;

import java.util.Scanner;

class SortingArray{
	
	public void display(){
		Scanner scan =new Scanner(System.in);
		int[] inputValue=new int[5];
		int i=0,j=0,k=0,max=0,min=0;
		k=inputValue.length;
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
		System.out.println("Ascending order :");
		for( i=0;i<=k-1;i++){
			System.out.println("Maximum Number :"+inputValue[i]);
		}
		System.out.println("Decending order :");
		for( i=k-1;i>=0;i--){
			System.out.println("Maximum Number :"+inputValue[i]);
		}
	}
	public static void main(String args[]){
//		Scanner scan =new Scanner(System.in);
//		int[] inputValue=new int[5];
//		int i=0,j=0,k=0,max=0,min=0;
//		k=inputValue.length;
//		System.out.println("Enter the input value");
//		for(i=0;i<k;i++){
//			inputValue[i] = scan.nextInt();
//			//System.out.print(a[i]);
//		}
//		for( i=0;i<k;i++){
//			for( j=i+1;j<k;j++){			
//			if(inputValue[i]>inputValue[j]){				
//				max = inputValue[i];		
//                inputValue[i]=inputValue[j];
//                 inputValue[j]=max;				
//				}						
//			}			
//		}
//		System.out.println("Ascending order :");
//		for( i=0;i<=k-1;i++){
//			System.out.println("Maximum Number :"+inputValue[i]);
//		}
//		System.out.println("Decending order :");
//		for( i=k-1;i>=0;i--){
//			System.out.println("Maximum Number :"+inputValue[i]);
//		}
//		
		SortingArray soar =new SortingArray();
		soar.display();
	}
}