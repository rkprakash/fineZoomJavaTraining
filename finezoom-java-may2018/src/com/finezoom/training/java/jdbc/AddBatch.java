package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddBatch {

	public static void main(String[] args) throws SQLException {
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stm = con.createStatement();
			System.out.println("Enter");
			for (int i = 0; i < 5; i++) {
				String query = "INSERT INTO EMPLOYEE_ADDS (EMP_ID,EMP_NAME,EMP_AGE)" + "VALUES ('" + scan.nextInt()
						+ "',' " + scan.next() + "','" + scan.nextInt() + "')";
				stm.addBatch(query);
			}
			stm.executeBatch();
			stm.close();
			con.close();

		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
