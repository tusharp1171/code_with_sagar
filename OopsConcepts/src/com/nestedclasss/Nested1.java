package com.nestedclasss;

public class Nested1 {
	
	public class Nested2{
	 int a=10;
		}
	public static void main(String[] args) {
		Nested1 n1=new Nested1();
		
		Nested2 n2=n1.new Nested2();
		       
		     System.out.println(n2.a);  
		        
		           
		
			
	}
}

