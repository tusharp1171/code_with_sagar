package com.exception11;

public class UncheckedExceptionss {
public static void main(String[] args) {
	try {
		int a=10,b=0;
		int c=a/b;  //10/0;
		System.out.println(c);
	} 
	catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("handle this:"+e.getMessage());
	}
	
	finally {
		System.out.println("finally block");
	}
	
}
}
