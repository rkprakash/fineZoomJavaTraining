package com.finezoom.training.java.oop;

/**
 * abstract 
 *
 */
public  class EmpDetailAbt extends EmpDetails {

	 void display(){
		 System.out.println("RKP");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmpDetails empde = new EmpDetailAbt() ;
		empde.display();
	}

}
