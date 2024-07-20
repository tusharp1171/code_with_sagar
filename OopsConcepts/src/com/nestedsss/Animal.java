package com.nestedsss;

public class Animal {

	public class Dog{
		void m1()
		{
			System.out.println("Hello");
		}
		
	}
	
	public static void main(String[] args) {
		Animal an=new Animal();
		Dog d=an.new Dog();
		    d.m1();
	}
}
