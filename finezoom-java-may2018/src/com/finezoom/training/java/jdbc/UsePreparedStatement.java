package com.finezoom.training.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Using Prepared statement
 *
 */
public class UsePreparedStatement {

	public static void prepare(String[] args) {
		// TODO Auto-generated method stub
		
		
		autoCommit();
		prepare();
	}
	
	//auto commit;
	public static void autoCommit() {
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stm = con.createStatement();
			String PROCEDURE2 = null;
			CallableStatement callableStatement = con.prepareCall(PROCEDURE2);
			callableStatement.executeUpdate();
			String userName = callableStatement.getString(2);
			String createdBy = callableStatement.getString(3);
			
			System.out.println(userName+", "+createdBy);
		}catch (Exception e) {
			e.getMessage();
		}
	}
	public static void prepare() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the update name");
		String names = scan.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			PreparedStatement prestate = con.prepareStatement("update EMPLOYEE_DETAILS SET EMP_DEPT=?"+" where EMP_NAME = ? ");
			prestate.setString(1,"TESTER");
			prestate.setString(2, names);
			prestate.executeQuery();
			PreparedStatement select = con.prepareStatement("SELECT  EMP_NAME ,EMP_GENDER FROM EMPLOYEE_DETAILS S");
			ResultSet rs= select.executeQuery();
			while(rs.next()) {
				System.out.println("EMP_NAME : "+rs.getString(1)+" EMP_DEPT : "+rs.getString(2));
			}
			rs.close();
			scan.close();
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
