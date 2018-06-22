package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ProcedureMysql {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con;
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","admin");
			System.out.println("Connect DB");
			Statement  stmt = con.createStatement();
			
			
			ResultSet rs = stmt.executeQuery("select * from actor");
			while(rs.next())
				System.out.println(rs.getInt(1)+" "+rs.getInt(2));
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			
		}

	}

}
