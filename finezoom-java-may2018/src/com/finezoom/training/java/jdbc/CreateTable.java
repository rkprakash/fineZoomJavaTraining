package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Create table
 *
 */
public class CreateTable {

	public static void main(String[] args) throws  ClassNotFoundException, SQLException {

		//Remove();
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stmt = con.createStatement();

			stmt.executeQuery("CREATE TABLE EMPLOYEE_ADDS(EMP_ID int,EMP_NAME varchar(20),EMP_AGE int)");

			//con.close();
		} catch (SQLException e) {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			int size = 3;
			Statement stm = con.createStatement();
			for (int i = 0; i < size; i++) {
				stm.executeQuery("INSERT INTO EMPLOYEE_ADDS (EMP_ID,EMP_NAME,EMP_AGE)" + "VALUES ('" + scan.nextInt()
						+ "',' " + scan.next() + "','" + scan.nextInt() + "')");
			}
			con.close();
		}
		scan.close();
				
	}

	private static void Remove() throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stam = con.createStatement();

			stam.executeQuery("DROP TABLE EMPLOYEE_ADDS");

			System.out.println("TABLE DROP");

			con.close();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

}
