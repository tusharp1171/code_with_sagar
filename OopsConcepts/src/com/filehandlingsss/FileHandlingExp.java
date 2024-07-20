package com.filehandlingsss;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExp {
public static void main(String[] args) throws IOException {
//	try {
//		File f = new File("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
//		
//		  //File f1 = new File("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\pqr.txt");
//			if(f.createNewFile())
//			{
//				System.out.println("file is create :"+f.getName());
//			}
//			else {
//				System.out.println("file s already exits");
//			}
//	} catch (IOException e) {
//		System.out.println("Exception error occur");
//		e.printStackTrace();
//	}
	
	
//	  File f = new File("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
//	if(f.exists())
//	{
//		System.out.println("file is already exits :"+f.getName());
//	}
//	else {
//		System.out.println("file is not present this location");
//	}
//	try {
//		FileWriter f = new FileWriter("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
//		f.write(" I am java Developer");
//			
//		f.close();
//		System.out.println("write sucessfully");
//	} catch (Exception e) {
//		System.out.println("error occur");
//		e.printStackTrace();
//	}
//	
//	try {
//		FileReader f1=new FileReader("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
//		  Scanner sc=new Scanner(f1);
//		  if(sc.hasNextLine())
//		  {
//			  String fdata=sc.nextLine();
//			  System.out.println(fdata);
//		  }
//		  f1.close();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	
//	 File f2 = new File("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
//	 if(f2.delete())
//	 {
//		 System.out.println("file is deelted Sucessfully"); 
//	 }
//	 else {
//		 System.out.println("file has been error occur"); 
//	 }
	
	   try {
		   FileReader f= new FileReader("C:/Users/Ravi/Desktop/TechnoGrowth/pqr.txt");
		   Scanner s=new Scanner(f);
		       if(s.hasNextLine())
		       {
		    	   String filedata=s.nextLine();
		    	   System.out.println(filedata);
		       }
		  
		     f.close();
			   System.out.println("read sucessfully");
		
	} catch (Exception e) {
		System.out.println("error occur");
		e.printStackTrace();
		
		// TODO: handle exception
	}
}
}
