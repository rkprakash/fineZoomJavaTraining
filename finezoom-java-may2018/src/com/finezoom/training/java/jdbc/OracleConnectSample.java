package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class OracleConnectSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","fbcc","mtp");
			System.out.println("Connect DB");
			Statement  stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GTP_USER");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getInt(2));
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}
	}

}
