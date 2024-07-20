package com.hierarchical2;

public class Test {

	public static void main(String[] args) {
		A a1=new A();
		//  a1.m1();
		A a2=new B();
		   a2.m1();
		A a3= new C();
		A a4= new D();
		//  a4.m1();
		A a5= new E();
		A a6= new F();
		//   System.out.println(a6.b);
		//---------------------------//
		B b1=new B();
		B b2= new D();
		B b3= new E();
		 
		//  System.out.println( b3.b);
		//-----------------------------//
		C c1 =new C();
		C c2=new F();
		//--------------------------------//
		D d1=new D();
//		  d1.m1();
//		  d1.m10();
//		  d1.m5();
		E e1=new E();
		F f1=new F();

	}

}
