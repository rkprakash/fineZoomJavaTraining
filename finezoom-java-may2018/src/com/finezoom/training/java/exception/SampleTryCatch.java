package com.finezoom.training.java.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class SampleTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File aFile = new File("F:/SG18050000000849_180502000008721.xml");
        try {
            FileReader aReader = new FileReader(aFile);
        } catch (FileNotFoundException e) {
            
            System.out.println(" Specified file is not found");
        }finally{
            System.out.println( " Finished operation ");
        }
	}

}
