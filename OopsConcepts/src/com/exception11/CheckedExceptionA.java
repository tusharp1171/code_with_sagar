package com.exception11;


import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionA {
public static void main(String[] args) throws IOException {
	try {
		FileReader fr= new FileReader("file.txt");
		System.out.println(fr);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("file is not available in system");
	}
	finally {
		System.out.println("this is finally block");
	}
}
}