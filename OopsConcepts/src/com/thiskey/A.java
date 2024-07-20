package com.thiskey;

public class A {
	A() {
		System.out.println("Constructor ----call");
	}
	A(int a) {
		System.out.println("Constructor ----call---parametrized");
	}

	public void m1() {
	//	this.m2();
		System.out.println("m1---B");
	}

	public void m1(int a) {
		this.m1();
		System.out.println("m1---B--parameterized");
	}

	public void m2() {
		//this.m1();
		this.m1(10);
		System.out.println("m2---B");
	}
	
	public static void main(String[] args) {
		A a =new A();
		  a.m2();
		  
	}
}

