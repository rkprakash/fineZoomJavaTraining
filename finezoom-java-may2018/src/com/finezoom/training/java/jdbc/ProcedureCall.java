package com.finezoom.training.java.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureCall {

	public static void main(String[] args) throws ClassNotFoundException {
		//Scanner scan = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = null;
		CallableStatement callableStatement = null;
		String usrSql = "{call dispaly}";
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
				callableStatement = con.prepareCall(usrSql);
			callableStatement.executeUpdate();
			int empId = callableStatement.getInt(1);
			//String createdBy = callableStatement.getString(2);
			

			System.out.println("EMP_ID : " + empId);
		
			
			con.close();
		} catch (SQLException e) {
				
		 e.printStackTrace();
		}

	}

}
