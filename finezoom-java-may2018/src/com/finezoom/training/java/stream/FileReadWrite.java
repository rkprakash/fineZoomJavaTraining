package com.finezoom.training.java.stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		readOnly();

	}

	public static void readOnly() throws FileNotFoundException, IOException {
		FileReader in = new FileReader("f:/task2out.txt");
		BufferedReader br = new BufferedReader(in);

		FileWriter fe = new FileWriter("f:/task01.txt");
		PrintWriter pw = new PrintWriter(fe);
		String c = br.readLine();
		while (c != null) {
			pw.write(c);
			c = br.readLine();
			System.out.println(c);

		}
		// pw.println(111);
		pw.close();

	}

}
