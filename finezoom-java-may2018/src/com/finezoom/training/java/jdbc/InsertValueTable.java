package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertValueTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.println("How many record enter?");
		size = scan.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stm = con.createStatement();
			for (int i = 0; i < size; i++) {
				stm.executeQuery("INSERT INTO EMPLOYEE_ADDS (EMP_ID,EMP_NAME,EMP_AGE)" + "VALUES ('" + scan.nextInt()
						+ "',' " + scan.next() + "','" + scan.nextInt() + "')");
			}
			PreparedStatement ss = con.prepareStatement("UPDATE EMPLOYEE_ADDS SET EMP_NAME =?" + " where EMP_AGE=? ");
			ss.setString(1,"RKP");
			ss.setInt(2,23);
			ss.executeUpdate();
			System.out.println("Inserted values");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}finally {
			scan.close();
		}

	}

}
