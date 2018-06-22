package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UseInsert {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
	
		Statement st = con.createStatement();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the value");
		for(int i=0;i<4;i++)
		{
		System.out.println("insert the employee id into db:");
		int id = scan.nextInt();
		System.out.println("insert the employee name into db:");
		String name=scan.next();
		System.out.println("insert the employee age into db:");
		int age = scan.nextInt();
		
		
		
		PreparedStatement ps=con.prepareStatement("INSERT INTO EMPLOYEE_ADDS(EMP_ID,EMP_NAME,EMP_AGE)VALUES(?,?,?) ");
		
		ps.setInt(1, id);

		ps.setString(2, name);

		ps.setInt(3, age);

		ps.executeQuery();
		}
	}

}
