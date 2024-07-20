package com.privatedbb;

public class privateaccess {
	 private int a=10;
private void m1()
{
	System.out.println("private method");
}
public static void main(String[] args) {
	privateaccess pss=new privateaccess();
	               pss.m1();
	               System.out.println(pss.a);
}
}
