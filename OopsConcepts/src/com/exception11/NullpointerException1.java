package com.exception11;

public class NullpointerException1 {
public static void main(String[] args) {
	try {
		String s=null;
		//System.out.println(s);
		if(s.equals("abc"))
				{
			System.out.println("string are same");
				}
		else {
			System.out.println("not same");
		}
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println("handle this exception successfully");
	}
	
}
}
