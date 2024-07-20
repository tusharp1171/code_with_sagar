package com.filehandling11;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile1 {
public static void main(String[] args) {
	try {
		FileWriter f=new FileWriter("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\abc.txt");
	    f.write(" I am Java Developer");
	    f.close();
	    System.out.println("write Sucessfully");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error occur");
		e.printStackTrace();
	}
}
}
