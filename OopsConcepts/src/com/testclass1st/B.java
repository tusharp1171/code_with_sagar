package com.testclass1st;

public class B extends A{
	public void m1(int a)
	{
	System.out.println("m1---B");	
	}
	public static void main(String[] args) {
		B b= new B();
		   b.m1(10);
		   
	}
}
