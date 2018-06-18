package com.finezoom.training.java.emp;

import java.io.IOException;
import java.util.ArrayList;

/**
 *Interface of service class
 *
 */
public interface EmployeeDetailsMethod {
	public Boolean add(ArrayList<EmployeeAdditional> listofEmpl);
	public Boolean update(int getEmpId,ArrayList<EmployeeAdditional> listofEmpl) ;
	public Boolean delete(int getEmpId );
	public void update(EmployeeAdditional emp) ;
	public Boolean find(String getDept,ArrayList<EmployeeAdditional> listofEmpl);
	//void add(EmployeeServices emp);
	
}
