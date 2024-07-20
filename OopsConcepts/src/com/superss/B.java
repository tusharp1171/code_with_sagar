package com.superss;

public class B extends A{
	
	int c=12;
	public B ()
	{
		//super(28);
		System.out.println("constructor----B");
	}
	
	public void m1()
	{
		super.m1();
		super.m2(10);
		System.out.println("m1--B");
		
		System.out.println(super.a);
		
	}
 public static void main(String[] args) {
	B b=new B();
	   b.m1();
}
}
