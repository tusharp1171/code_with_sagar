package com.collectionclasss;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollNo(10);
		s1.setName("abc");
		Student s2 = new Student();
		s2.setRollNo(14);
		s2.setName("pqr");
		Student s3 = new Student();
		s3.setRollNo(6);
		s3.setName("cds");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for sorting RollNo wise");
		             
		             System.out.println("Enter 2 for sorting Name wise ");
		             System.out.println("Enter your choice ");
		            int ch= sc.nextInt();
		            Set<Student> ss=null;
		            if(ch==1)
		            {
		            	ss=new TreeSet<Student>(new RollN0());// RollN0()	
		            }
		            else if(ch==2)
		            {
		            	ss=new TreeSet<Student>(new NameSort());// RollN0()	
		            }
				
		             ss.add(s1);
		             ss.add(s2);
		             ss.add(s3);
		             
		             for(Student snew:ss)
		             {
		            	 System.out.println(snew.getName()+" : "+snew.getRollNo());
		            	
		             }
		             
		             
	}
	

}
