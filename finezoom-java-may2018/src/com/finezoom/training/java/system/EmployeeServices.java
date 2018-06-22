package com.finezoom.training.java.system;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeServices implements EmployeeInterface {
	Scanner scan = new Scanner(System.in);

	@Override
	public void add(HashSet<AdditionalEmployeeDetails> empHash) throws SQLException, ClassNotFoundException {
		AdditionalEmployeeDetails adEmp = null;
		// Scanner scan = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("Enter the Employee details");
		System.out.println("--------------------------");
		System.out.println("How many record enter?");
		int size = scan.nextInt();
		for (int i = 0; i < size; i++) {
			adEmp = new AdditionalEmployeeDetails();
			System.out.println("Employee Name");
			adEmp.setEmpName(scan.next());
			System.out.println("Enter the dept:");
			adEmp.setEmpDept(scan.next());
			System.out.println("EmployeeAge");
			adEmp.setEmpAge(scan.nextInt());
			System.out.println("Employee Id");
			adEmp.setEmpId(scan.next());
			System.out.println("Employee gender");
			adEmp.setEmpGender(scan.next());
			System.out.println("--------------------------");
			empHash.add(adEmp);
		}

		Iterator<AdditionalEmployeeDetails> itr = ((HashSet<AdditionalEmployeeDetails>) empHash).iterator();
		while (itr.hasNext()) {
			AdditionalEmployeeDetails anEmployeeAdditional = itr.next();
			System.out.print(anEmployeeAdditional.getEmpName());
			System.out.print(anEmployeeAdditional.getEmpDept());
			System.out.print(anEmployeeAdditional.getEmpAge());
			System.out.print(anEmployeeAdditional.getEmpId());
			System.out.print(anEmployeeAdditional.getEmpGender());
			System.out.println();

			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con;
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
				Statement stmt = con.createStatement();
				stmt.executeQuery(
						"CREATE TABLE EMPLOYEE_DETAILS(EMP_NAME varchar(15),EMP_DEPT varchar(10),EMP_AGE int,EMP_ID varchar(10),EMP_GENDER varchar(10))");
			} catch (SQLException e) {
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e1) {

					e1.printStackTrace();
				}
				Connection con;
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
				PreparedStatement stmt = con.prepareStatement("INSERT INTO EMPLOYEE_DETAILS(EMP_NAME,EMP_DEPT,EMP_AGE,EMP_ID,EMP_GENDER)VALUES(?,?,?,?,?) ");
				stmt.setString(1, anEmployeeAdditional.getEmpName());
				stmt.setString(2, anEmployeeAdditional.getEmpDept());
				stmt.setInt(3, anEmployeeAdditional.getEmpAge());
				stmt.setString(4, anEmployeeAdditional.getEmpId());
				stmt.setString(5, anEmployeeAdditional.getEmpGender());
				stmt.executeQuery();
				con.close();
			}
			
		}

	}

	@Override
	public Boolean find(HashSet<AdditionalEmployeeDetails> empHash) {
	
		System.out.println("--------------------------");
		System.out.println("Find the Employee details");
		System.out.println("--------------------------");
		System.out.println("Please enter the age");
		int fAge = scan.nextInt();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE_DETAILS");
			while (rs.next()) {
				if (fAge == rs.getInt(3)) {
					System.out.println("Name :" + rs.getString(1) + " \n" + rs.getString(2) + " " + rs.getInt(3) + " "
							+ rs.getInt(4) + " " + rs.getString(5));
				}
			}
			con.close();
		} catch (Exception e) {

		}
		return null;
	}

	@Override
	public Boolean update(HashSet<AdditionalEmployeeDetails> empHash) {
	
		System.out.println("--------------------------");
		System.out.println("Update the Employee details");
		System.out.println("--------------------------");
		System.out.println("Update of gievn id");
		String uId = scan.next(); // "102";
		System.out.println("Update the  gievn name");
		String uName = scan.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			
			String sqlcmd = "UPDATE EMPLOYEE_DETAILS SET EMP_NAME =?" + " WHERE EMP_ID =?";
			PreparedStatement updatess = con.prepareStatement(sqlcmd);
			updatess.setString(1, uName);
			updatess.setString(2, uId);
			updatess.executeUpdate();
			System.out.println("Record is updated ");

			con.close();
		} catch (Exception e) {
			e.getMessage();
		} 
		return null;

	}

	@Override
	public Boolean delete(String empName) {
		
		System.out.println("--------------------------");
		System.out.println("Drop the Employee details");
		System.out.println("--------------------------");
		System.out.println("Drop the Employee name");
		String dName = scan.next();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			String sqlcmd = "DELETE FROM EMPLOYEE_DETAILS WHERE EMP_NAME =?";
			PreparedStatement updatess = con.prepareStatement(sqlcmd);
			
			updatess.setString(1, dName);
			updatess.executeUpdate();
			System.out.println("Record is deleted ");

			con.close();
		} catch (Exception e) {
			e.getMessage();
		} 

		return null;
	}

	@Override
	public void report(HashSet<AdditionalEmployeeDetails> empHash) throws IOException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE_DETAILS");
			ArrayList<String> alist = new ArrayList<String>();

			while (rs.next()) {

				String name = rs.getString(1);

				String dept = rs.getString(2);
				int age = rs.getInt(3);
				String id = rs.getString(4);
				String gender = rs.getString(5);
				alist.add(name + " " + dept + " " + age + " " + id + " " + gender);

				FileWriter fw = new FileWriter("f:\\report.txt");
				PrintWriter pw = new PrintWriter(fw);
				for (String s : alist) {
					pw.write(s);
					pw.println();
				}

				pw.close();
			}
			con.close();
		} catch (Exception e) {

		}

	}

	// using file read to input
	@Override
	public void fileRead(HashSet<AdditionalEmployeeDetails> empHash) throws IOException {
		FileReader fr = new FileReader("f:\\reCreate.txt");
		BufferedReader br = new BufferedReader(fr);

		String aLine = br.readLine();

		while (aLine != null) {
			System.out.println(aLine);
			String[] aValue = aLine.split(",");
			System.out.println(aValue[0]+","+aValue[1]+","+aValue[2]+","+aValue[3]+","+aValue[4]);
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con;
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
				Statement stmt = con.createStatement();
				stmt.executeQuery(
						"INSERT INTO EMPLOYEE_DETAILS(EMP_NAME,EMP_DEPT,EMP_AGE,EMP_ID,EMP_GENDER)VALUES('" + aValue[0]
								+ "','" + aValue[1] + "','" + aValue[2] + "','" + aValue[3] + "','" + aValue[4] + "')");
				// stmt.executeQuery("SELECT * FROM EMPLOYEE_DETAILS");
			} catch (Exception e) {

			}
			aLine = br.readLine();
			br.close();
		}

	}

}
