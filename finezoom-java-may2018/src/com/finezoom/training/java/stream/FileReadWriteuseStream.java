package com.finezoom.training.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReadWriteuseStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();
		

        charMetho();
        
        byteMeth();
		
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void byteMeth() throws FileNotFoundException, IOException {
		FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
 
        try
        {
            sourceStream = new FileInputStream("f:\\taskk.txt");
            targetStream = new FileOutputStream ("f:\\targetfile.txt");
 
            // Reading source file and writing content to target
            // file byte by byte
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }
        finally
        {
            if (sourceStream != null)
                sourceStream.close();            
            if (targetStream != null)            
                targetStream.close();            
        }
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void charMetho() throws FileNotFoundException, IOException {
		FileReader sourceStream = null;
		FileWriter fo =null;
        try
        {
            sourceStream = new FileReader("f:\\taskk.txt");
            fo = new FileWriter("f:\\outStr.txt");
            
            int temp;
            while ((temp = sourceStream.read()) != -1)
                 System.out.println((char)temp);
            fo .write((char)temp);
            
        }
        finally
        {            
            
            if (sourceStream != null)            
                sourceStream.close();  
            fo.close();
        }
	}

	/**
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void read() throws FileNotFoundException, IOException {
		InputStream inStream       = new FileInputStream("f:\\taskk.txt");
		Reader      inReader = new InputStreamReader(inStream);
		OutputStream outStr = new FileOutputStream("f:\\newfile.txt");
		Writer wrt = new OutputStreamWriter(outStr);
		int data =inReader.read();
		while(data != -1){
		    char theChar = (char) data;
		    data = inReader.read();
		    System.out.print(theChar);
		    wrt.write(data);
		}

		//inReader.close();
		wrt.close();
	}

}
