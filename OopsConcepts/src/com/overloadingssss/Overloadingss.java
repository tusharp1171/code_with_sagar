package com.overloadingssss;

public class Overloadingss {
 int add(int a,int b)
{
	return a+b;
	}

 int add(int a,int b,int c)
{
	return a+b+c;
	}
public static void main(String[] args) {
	Overloadingss od=new Overloadingss();
	
	System.out.println(od.add(10, 20,30));
}


}
