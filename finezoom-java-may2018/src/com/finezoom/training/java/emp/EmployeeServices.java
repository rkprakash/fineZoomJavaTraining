package com.finezoom.training.java.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeServices implements EmployeeDetailsMethod {
	ArrayList<EmployeeAdditional> empList = new ArrayList<EmployeeAdditional>();

	@Override
	public Boolean add(ArrayList<EmployeeAdditional> listofEmpl) {

		Iterator<EmployeeAdditional> itr = ((List<EmployeeAdditional>) listofEmpl)
				.iterator();
		while (itr.hasNext()) {
			EmployeeAdditional anEmployeeAdditional = itr.next();
			System.out.print(anEmployeeAdditional.getDept());
			System.out.print(anEmployeeAdditional.getEmpAge());
			System.out.print(anEmployeeAdditional.getEmpId());
			System.out.print(anEmployeeAdditional.getEmpName());
			System.out.print(anEmployeeAdditional.getGender());
			System.out.println();
		}

		return true;
	}

	@Override
	public Boolean update(int getEmpId,ArrayList<EmployeeAdditional> listofEmpl) {
		Scanner scan = new Scanner(System.in);
		//List<EmployeeAdditional> listofEmpl = null;
		Iterator<EmployeeAdditional> itr = ((List<EmployeeAdditional>) listofEmpl)
				.iterator();
		int index=0;
		while (itr.hasNext()) {
			EmployeeAdditional anEmployeeAdditional = itr.next();
			if(getEmpId == anEmployeeAdditional.getEmpId()){
				System.out.println(getEmpId);
			int value=index;
				System.out.println("Enter the age");
				int empAge = scan.nextInt();
				//anEmployeeAdditional.setEmpAge(empAge);
				listofEmpl.get(value).setEmpAge(empAge);
			}
			index++;
		}
	for (EmployeeAdditional employeeAdditional : listofEmpl) {
		
		System.out.print(employeeAdditional.getDept());
		System.out.print(employeeAdditional.getEmpAge());
		System.out.print(employeeAdditional.getEmpId());
		System.out.print(employeeAdditional.getEmpName());
		System.out.print(employeeAdditional.getGender());
	}
		
		return null;

	}

	@Override
	public Boolean delete(int getEmpId) {
		ArrayList<EmployeeAdditional> listofEmpl = null;
		ArrayList<EmployeeAdditional> empList = listofEmpl;
	//	List<EmployeeAdditional> listofEmpl = null;
//		Iterator<EmployeeAdditional> itr = (Iterator<EmployeeAdditional>)  listofEmpl.iterator();
//		
//		while(itr.hasNext()){
//			System.out.println(itr.next().r);
//		}
		for (EmployeeAdditional employeeAdditional : listofEmpl) {
			
		}
		return null;
	}

	@Override
	public void update(EmployeeAdditional emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public Boolean find(String getDept,ArrayList<EmployeeAdditional>listofEmpl) {
		
		Scanner scan = new Scanner(System.in);
		//List<EmployeeAdditional> lisst = new ArrayList<EmployeeAdditional>();
		
		Iterator<EmployeeAdditional> itr = ((List<EmployeeAdditional>) listofEmpl).iterator();
		//int index=0;
		
		for (EmployeeAdditional employeeAdditional : listofEmpl) {
			//System.out.println(employeeAdditional);
			if(getDept.equals(employeeAdditional.getDept()) )	{
				System.out.println(employeeAdditional.getDept());
				System.out.println(employeeAdditional.getEmpAge());
				System.out.println(employeeAdditional.getEmpId());
				System.out.println(employeeAdditional.getEmpName());
				System.out.println(employeeAdditional.getGender());
			}
		}
//		while (itr.hasNext()) {
//			EmployeeAdditional anEmployeeAdditional = itr.next();
//			
//			if(dept == anEmployeeAdditional.getDept()){
//				
//				value = index;			
////				
////				listofEmpl.get(value).getDept();
////				listofEmpl.get(value).getEmpAge();
////				listofEmpl.get(value).getEmpId();
////				listofEmpl.get(value).getEmpName();
////				listofEmpl.get(value).getGender();
////				
//				
//				System.out.println(anEmployeeAdditional.getDept());
//				System.out.println(anEmployeeAdditional.getEmpAge());
//				System.out.println(anEmployeeAdditional.getEmpId());
//				System.out.println(anEmployeeAdditional.getEmpName());
//				System.out.println(anEmployeeAdditional.getGender());
//			}
//			index++;
//		}
////		for (EmployeeAdditional employeeAdditional : listofEmpl) {
////			System.out.println(employeeAdditional.getDept());
////			System.out.println(employeeAdditional.getEmpAge());
////		}

	return null;

	}

	public Boolean add() {
		// TODO Auto-generated method stub
		return null;
	}

}
