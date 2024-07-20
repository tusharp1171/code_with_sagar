package com.abstractssexample;


public class OverloadingExample {
 public int add(int a ,int b)
 {
	 int r=a+b;
	return r;
	 
 }
 public int add(int a ,int b,int c)
 {
	return a+b+c;
	 
 }
 public static void main(String[] args) {
	 OverloadingExample obj1=new OverloadingExample();
	 int result=obj1.add(10, 10,10);
	 System.out.println(result);
}
}
