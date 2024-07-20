package com.filehandling11;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {

	public static void main(String[] args) {
		File f= new File("C:\\Users\\Ravi\\Desktop\\TechnoGrowth\\abc.txt");
		try {
			if(f.createNewFile())
			{
			    System.out.println("successfully Created");	
			}
			else {
				System.out.println("file already exist");
			}
		} catch (IOException e) {
			System.out.println("error occcuered here ");
			
			e.printStackTrace();
		}

	}

}
