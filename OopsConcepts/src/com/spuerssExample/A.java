package com.spuerssExample;

public class A {

	A() {
		System.out.println("Constructor ----call");
	}
	A(int a) {
		System.out.println("Constructor ----call---parametrized");
	}

	public void m1() {
		System.out.println("m1---A");
	}

	public void m1(int a) {
		System.out.println("m1---A--parameterized");
	}

	public void m2() {
		System.out.println("m2---A");
	}
}
