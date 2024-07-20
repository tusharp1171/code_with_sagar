package com.abstractss;

public class A {
	public A()
	{
		System.out.println("call---con---");
	}
	public A(int a,int b)
	{
		System.out.println(a+b);
	}
public static void main(String[] args) {
	A a=new A();
	A a1=new A(10, 20);
	  
}
}
