package com.finezoom.training.java.system;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeeMainSystem {
	public static void main(String args[]) throws ClassNotFoundException, SQLException, IOException {
		EmployeeServices empSer = new EmployeeServices();
		HashSet<AdditionalEmployeeDetails> empHash = new HashSet<AdditionalEmployeeDetails>();
		System.out.println("-------------------");
		System.out.println("Employee details");
		System.out.println("-------------------");
		Scanner scan = new Scanner(System.in);

		int ch;
		do {
			System.out.println("1.Add\n2.find\n3.update\n4.delete\n5.report\n6.fileread\nEnter the option\n...........");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				empSer.add(empHash);
				break;
			case 2:
				empSer.find(empHash);
				break;
			case 3:
				empSer.update(empHash);
				break;
			case 4:
				empSer.delete(null);
				break;
			case 5:
				empSer.report(empHash);
				System.out.println("Report genrate on local disk");
				break;
			case 6:
				empSer.fileRead(empHash);
				System.out.println("Data added");
				break;

			default:
				System.out.println("Please correct input value");
				break;

			}
			System.out.println("\nDo You Want to Print it again ? 1 Yes/0 No: ");
			ch = scan.nextInt();
		} while (ch == 1);

		System.out.println("Comlete....");
		scan.close();
	}

}
