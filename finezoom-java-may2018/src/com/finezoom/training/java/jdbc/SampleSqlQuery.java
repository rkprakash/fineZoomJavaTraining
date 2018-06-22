package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SampleSqlQuery {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = null;

		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			String aQuery = "select *  FROM EMPLOYEE_ADDS LEFT JOIN EMPLOYEE_DETAILS ON EMPLOYEE_ADDS.EMP_ID = EMPLOYEE_DETAILS.EMP_ID";
			PreparedStatement pst = con.prepareStatement(aQuery);
			ResultSet re = pst.executeQuery();
			while(re.next()) {
				System.out.println(+re.getInt(1));
			}
			
			System.out.println("----------");
			String bQuery = "SELECT EMP_NAME FROM EMPLOYEE_ADDS WHERE EMP_NAME LIKE 'RK%'";
			re = con.prepareStatement(bQuery).executeQuery();
			while(re.next()) {
				System.out.println(re.getString(1));
			}
		}catch (Exception e) {
			
		}

	}

}
