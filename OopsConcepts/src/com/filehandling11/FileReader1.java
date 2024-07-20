package com.filehandling11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReader1 {
public static void main(String[] args) throws IOException {
	try {
		FileReader f=new FileReader("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\abc.txt");
	        Scanner s=new Scanner(f);
	            if(s.hasNextLine())
	            {
	            	  Object fileData= s.nextLine();
	            	  System.out.println(fileData);
	            	  
	            }
	            f.close(); 
	
	} catch (FileNotFoundException e) {
		System.out.println("error occur");
		e.printStackTrace();
	} 
//	catch (IOException e) {
//		System.out.println("error occur due to Io Exception");
//		e.printStackTrace();
//	}
}
}
