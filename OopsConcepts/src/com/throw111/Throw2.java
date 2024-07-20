package com.throw111;



public class Throw2 {


	public static void m1(int age)throws InvalidAgeException
	{
		if(age<18)
		{
			//System.out.println("age is not valid");
			throw new InvalidAgeException("age is not valid for voting");
		}
		else
		{
			System.out.println("age is  valid for voting");
		}
		
	}
	
	public static void main(String[] args) {
		try {
			m1(10);
		} catch (InvalidAgeException e) {
			System.out.println("handle custom Exception ");
			
			
		}
		  
	}

}
