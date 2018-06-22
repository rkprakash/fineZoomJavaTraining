package com.finezoom.training.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class RetriveValue {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SPORTS", "SPORTS");
			Statement stm = con.createStatement();
			
			int choice;
			System.out.println("Enter the option\n1.Total Table Print\n2.List of Employee Name\n3.List of Employee ID\n4.List of Employee AGE\n5.List of Employee Name&ID\n6.Detail");
			choice =scan.nextInt();
			switch (choice) {
			case 1:
				ResultSet rs = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS ");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3));
				}
				break;
			case 2:
				ResultSet	rs1 = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS");
				while(rs1.next()) {					
					System.out.println(rs1.getString(2));
				}
				break;
			case 3:
				ResultSet rs11 = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS");
				while(rs11.next()) {
					System.out.println(rs11.getInt(1));
				}
				break;
			case 4:
				ResultSet re = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS");
				while(re.next()) {
					System.out.println(re.getString(3));
				}
				break;
			case 5:
				ResultSet re1 = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS");
				while(re1.next()) {
					System.out.println(re1.getInt(1)+" "+re1.getString(2));
				}
			case 6:
				int datas = scan.nextInt();
				ResultSet rss = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS");
				while(rss.next()) {
					if(datas == rss.getInt(1)) {
						System.out.println(rss.getInt(3)+""+rss.getString(2));
					}
				}
				
				//ResultSet rss = stm.executeQuery("SELECT * FROM EMPLOYEE_ADDS WHERE EMP_ID='"+scan.nextInt());
				//while(re1.next()) {
				//	System.out.println(rss.getInt(1)+" "+rss.getString(2));
			//	}
				break;
			default:
				break;
			}
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}finally {
			scan.close();
		}
		
	}
	
}
