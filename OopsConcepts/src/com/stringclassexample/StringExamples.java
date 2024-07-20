package com.stringclassexample;

public class StringExamples {
public static void main(String[] args) {
	String s1="Rahula";
	String s2="RahulJadhav";
	int count=0;
	//String  s2=s1.toLowerCase();
	//String s2=new String("Rahul");
	for(int i=0;i<s1.length();i++)
	{
		
		//System.out.println(s1.charAt(i));
		// count++;
	}
	     
	StringBuilder sb=new StringBuilder("abc");
			//sb.reverse();
	          sb.append("cv");
		//	System.out.println("reverse of abc :"+sb);
	System.out.println(s1.equals(s2));
	//System.out.println(s2);
}
}
