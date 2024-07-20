package com.stringclassexample;

public class Example2 {
	public static void main(String[] args) {
		 String s="Abcdaba";	
		          String s1=s.toLowerCase();
		        //  System.out.println(s1);
		                   int len=s1.length();
		          for(int i=0;i<len;i++)
		          {
		         	  for(int j=i+1;j<len;j++)
		        	  {
		        		  if(s1.charAt(i)==s1.charAt(j))
		        		  {
		        			  System.out.println("Duplicate char :"+s1.charAt(j));
		        		  }
		        	  }
		          }
	}
  
}
