package com.finezoom.training.java.oops;

public class PassingParameter {
	
	public int display(int x){
		
		 x = 100;
		return x;
		
	}
	
	public static void main(String args[]){
		
		PassingParameter disp = new PassingParameter();
		
		int x = 10;
		disp.display(x);
		System.out.println(x);
	}

}
