package com.finezoom.training.java.array;

import java.util.Scanner;

public class SumofTenExactlyThirty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] inputValue = new int[5];
		int i, temp=0,sValue;
		System.out.println("Enter the array value:");
		for(i=0;i<inputValue.length;i++){
			inputValue[i]=scan.nextInt();
		}
		System.out.println("Enter the satisfy value:");
		sValue=scan.nextInt();
		for(i=0;i<inputValue.length;i++){
			if(inputValue[i]==sValue){
				 temp = inputValue[i]+temp;	
				 System.out.println(temp);
			}
		}
		if(temp<=30){
			System.out.println("The array is satisfed");
		}
		else{
			System.out.println("The array is not satisfed");
		}

	}

}
