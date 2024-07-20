package com.superss;

public class A {
	
	public A()
	{
		System.out.println("constructor----A");
	}
	public A(int a)
	{
		System.out.println("constructor----A---parameterized");
	}
	int a=10;
	public void m1()
	{
		System.out.println("m1---A");
	}
	public int  m2(int b)
	{
		System.out.println("m2---A---int");
		return b;
	}
	public void m2(String s)
	{
		System.out.println("m2---A-----string");
	}

}
