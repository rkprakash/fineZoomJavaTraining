package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RollBack {
	public static void main(String[] args) throws  ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			con.setAutoCommit(false);
			Statement stm = con.createStatement();
			System.out.println("Enter");
			for (int i = 0; i < 2; i++) {
				String query = "INSERT INTO EMPLOYEE_ADDS (EMP_ID,EMP_NAME,EMP_AGE)" + "VALUES ('" + scan.nextInt()
						+ "',' " + scan.next() + "','" + scan.nextInt() + "')";
				stm.executeQuery(query);
				con.commit();
			}
			
			stm.close();
			con.close();
		} catch (SQLException e) {
			
			System.out.println("Rollback");
				try {
					if(con!=null) 
					con.rollback();
					con.close();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				
		//	e.printStackTrace();
		}
		
}
}
