package com.thisss;

public class A {
	//we can implement only single class
	public A() {
		System.out.println("constructor calling");
	}
	public void m1()
	{
		//this.m2(10);
		System.out.println("m1---A");
	}
	public int  m2(int b)
	{  
		this.m1();
		System.out.println("m2---A --int");
		return b;
	}
	public void m2(String s)
	{
		 this.m2(20);
		System.out.println("m2---A---String");
	}
	
	public static void main(String[] args) {
		A a =new A();
		  a.m2("abc");
	}
}
