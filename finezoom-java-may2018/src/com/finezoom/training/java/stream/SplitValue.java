package com.finezoom.training.java.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SplitValue {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("f:\\taskk.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("F:\\newsplit.txt");
		PrintWriter pw = new PrintWriter(fw);
		String aLine = br.readLine();

		while (aLine != null) {
			System.out.println(aLine);
			String[] aValue = aLine.split(",");
			System.out.println(aValue[2]);
			pw.write(aValue[2]);			
  			aLine = br.readLine();
		}
		pw.close();
	}
}