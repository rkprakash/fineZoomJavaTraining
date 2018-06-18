package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NewDataBaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con;
				
				con = DriverManager.getConnection("jdbc:mysql://localhost:1521/learingsql","root","root");
				System.out.println("Connect DB");
				Statement  stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("Select * from account");
				while(rs.next())
					System.out.println(rs.getInt(1)+" "+rs.getInt(2));
				con.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				
			}
		
		
		
	}

}
