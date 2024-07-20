package com.strings1111;

public class String2duplicate {
	 public static boolean isDuplicate(String s1,String s2)
	 {
		  int count=0;
		 for(int i=0;i<s1.length();i++)
		 {
			 for(int j=0;j<s2.length();j++)
			 {
				if(s1.charAt(i)==s2.charAt(j)) 
				{
					System.out.println(s1.charAt(i));
					count++;
					
				}
			 }
		 }
		 System.out.println(count);
		return count>0;
	 }
	public static void main(String[] args) {
		System.out.println(isDuplicate("abcdse", "abcdsexzjkfsiu"));

	}

}
