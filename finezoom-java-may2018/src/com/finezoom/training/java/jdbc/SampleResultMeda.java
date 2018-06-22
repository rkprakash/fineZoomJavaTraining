package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 *ResultSetMedaData , Databasemetada
 *
 */
public class SampleResultMeda {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM EMPLOYEE_DETAILS");
			ResultSet rs = ps.executeQuery();
			ResultSetMetaData rsd = rs.getMetaData();
			System.out.println("Coloumn count :" + rsd.getColumnCount());
			System.out.println("Coloumn Type" + rsd.getColumnTypeName(1));
			System.out.println("Display column size"+rsd.getColumnDisplaySize(1));
			System.out.println("Display column name :"+rsd.getColumnLabel(1));
			System.out.println(rsd.getColumnName(1));
			

			DatabaseMetaData dbmd = con.getMetaData();

			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: " + dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: " + dbmd.getDatabaseProductVersion());

		} catch (Exception e) {

		}
	}

}
