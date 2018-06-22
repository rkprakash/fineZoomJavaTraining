package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DropValues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
		Statement stm = con.createStatement();
		stm.executeQuery("DELETE FROM EMPLOYEE_ADDS ");
		con.close();
	}

}
