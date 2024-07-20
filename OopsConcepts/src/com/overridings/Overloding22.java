package com.overridings;

public class Overloding22 extends Overridings{
	
	public int add(int a,int b)
	{
		super.add(10, 5);
		System.out.println("icic bank");
		return a+b;
		
	}
	public static void main(String[] args) {
		Overloding22 ovr22=new Overloding22();
		
		System.out.println(ovr22.add(10, 25));
	}

}
