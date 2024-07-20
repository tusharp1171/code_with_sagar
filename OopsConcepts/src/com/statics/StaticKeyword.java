package com.statics;

public class StaticKeyword {
	int clgId;
	static String clgName="jspm";
	String studentName;
	
	//constructor
	public StaticKeyword(int clgId, String studentName) {
		super();
		this.clgId = clgId;
		this.studentName = studentName;
	}
	
	public static void m1()
	{
		System.out.println(clgName);
		//clgName="AISSM";
	}
	
	static void changeCLgName()
	{
		clgName="AISSM";
	}
	
	public static void main(String[] args) {
		changeCLgName();
		StaticKeyword sk= new StaticKeyword(1, "sagar");
		m1();
		System.out.println(sk.clgId+"   and "+sk.studentName);
	}

}
