package com.filehandling11;

import java.io.File;

public class DeleteFile11 {
public static void main(String[] args) {
	try {
		//File f= new File("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\abc.txt");
		File f= new File("C:/Users/Ravi/Desktop/TechnoGrowth/abcs.txt");
		   if(f.delete())
		   {
			   System.out.println("file is deleted sucessfully");
		   }
		   else
		   {
			   System.out.println("file is not present");
		   }
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
