package com.exceptionss;

public class ArithmetcexceptionA {
	
public static void main(String[] args) {
	try {
		int a=1,b=0;
		int c=a/b; 
		System.out.println(c);
	} catch (ArithmeticException e) {
		// TODO: handle exception
		
		System.out.println("should not divide by 0");
	}
	finally {
		System.out.println("h");
	}
	
}
}
