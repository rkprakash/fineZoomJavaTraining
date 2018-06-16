package com.finezoom.training.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException2 {

	public static void readfile(String filepath) throws FileNotFoundException {
		File newFile = new File(filepath);
		FileReader newFilereader = new FileReader(newFile);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readfile("F:/task2.txt");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("File not found");
		} finally {
			System.out.println("Complete");
		}
	}

}
