package com.filehandling11;

import java.io.File;

public class getFileName1 {
public static void main(String[] args) {
try {
File f1=new File("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\abcdvhjvhdgdf.txt");
	
	if(f1.exists())
	{
		System.out.println("file is available :"+f1.getName());
	}
	else{
		
		if(f1.createNewFile()) {
			System.out.println("new file created");
		}
		else {
			System.out.println("file is not present please create new file ");
		}
		
	}
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Error occure");
	e.printStackTrace();
}
	
}
}
