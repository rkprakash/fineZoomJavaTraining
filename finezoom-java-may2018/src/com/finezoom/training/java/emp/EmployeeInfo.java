package com.finezoom.training.java.emp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeInfo {

	

	//private static EmployeeAdditional emp;

	public static void main(String[] args) {
		ArrayList<EmployeeAdditional> listofEmpl = new ArrayList<EmployeeAdditional>();
		EmployeeAdditional emp=null;
		EmployeeServices empds = new EmployeeServices();
		EmployeeDetails edet=null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Array");
		for(int i=0;i<2;i++){
			 emp=new EmployeeAdditional();
			 System.out.println("Employee Name");
				emp.setEmpName(scan.next());
			 System.out.println("Enter the dept:");
			emp.setDept(scan.next());
			System.out.println("EmployeeAge");
			emp.setEmpAge(scan.nextInt());
			System.out.println("Employee Id");
			emp.setEmpId(scan.nextInt());
			
			System.out.println("Employee gender");
			emp.setGender(scan.next());	
			listofEmpl.add(emp);
			}
		
		Boolean value=	empds.add(listofEmpl);
		
		if(value==true)
		{
		System.out.println("Success");	
		}else{
			System.out.println("Failure");
		}		
		
	Boolean jj=	empds.update(21,listofEmpl);
		
	//	String it="it";
		 empds.find("it",listofEmpl);
	}

}

