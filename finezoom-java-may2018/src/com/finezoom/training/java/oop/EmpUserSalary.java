package com.finezoom.training.java.oop;

/**
 * Inheritance
 *
 */
public class EmpUserSalary extends EmpUserDetails{
	void set(){
		System.out.println("Employeee Salary = 15000");
	}
	public static void main(String args[]){
		EmpUserSalary userDe =new EmpUserSalary();
		userDe.set();
		userDe.display(12,"rkp");
	}
}
