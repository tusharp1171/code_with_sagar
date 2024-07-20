package com.stringss;

public class StringCharfind {
   public static void main(String[] args) {
	   String s="Ravi";
	   String snew="Ravi";
     String s1= s.toLowerCase();
     String s2= snew.toLowerCase();
     int count=0;
//for(int i=0;i<s.length();i++)
//{
//	 System.out.println(s.charAt(i));
//	 count++;
//}
//System.out.println("count is :"+count);
//	   System.out.println(s);
//	   StringBuilder  sb=new StringBuilder();
//	       sb.append("Zinjade");
//	       System.out.println(""+sb);
//	      // sb.reverse();
//	       System.out.println(sb);
//	       sb.replace(1, 2, s);
//	       System.out.println(sb);
//	   for(int i=0;i<s.length();i++)
//	   { 
//		   for(int j=i+1;j<s1.length();j++)
//		   {
//			   if(s1.charAt(i)==s1.charAt(j))
//			   {
//				   System.out.println(s1.charAt(j));
//				  
//				   break;
//			   }
//		   }
//	   }
     
     if(s1.equals(s2))
     {
    	 System.out.println("String is same");
     }
     else {
    	 System.out.println("String is Not same");
	}
     
     String str111 = "Hello World";
     String str222 = "   Java   ";

     // Remove spaces from str1
     String result1 = str111.replaceAll("\\s", "");
     System.out.println("String 1 without spaces: " + result1);

     // Remove spaces from str2
     String result2 = str222.replaceAll("\\s", "");
     System.out.println("String 2 without spaces: " + result2);
 }
	   
}
	 

