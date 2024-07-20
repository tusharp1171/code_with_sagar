package com.comparatorss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Student s = new Student();
		s.setRollNo(1);
		s.setName("mahesh");
		s.setSalary(2000.00);

		Student s2 = new Student();
		s2.setRollNo(26);
		s2.setName("akash");
		s2.setSalary(14000.00);
		
		Student s3 = new Student();
		s3.setRollNo(19);
		s3.setName("samir");
		s3.setSalary(7000.00);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for RollSorting:");
		System.out.println("Enter 2 for NameSorting:"); 
		System.out.println("Enter 3 for SalarySorting:"); 
		System.out.println("Enter choice:");  
		      int ch= sc.nextInt();
		      
//		      Set<Student> sts=null;
//              
//		if(ch==1)
//		{
//			sts=new TreeSet<>(new RollNoSorting());	
//		}
//		else if(ch==2)
//		{
//			sts=new TreeSet<>(new NameSort());	
//		}
//		else if(ch==3)
//		{
//			sts=new TreeSet<>(new SalarySort());	
//		}
		
//		
//		sts.add(s);
//        sts.add(s2);
//        sts.add(s3);   
//        for(Student st1:sts)
//        {
//        	//System.out.println(st1);
//        	System.out.println(st1.getRollNo()+":"+st1.getName()+":"+st1.getSalary());
//        }
		      ArrayList<Student> sts=new ArrayList<>();
		      sts.add(s);
		        sts.add(s2);
		        sts.add(s3);
				if(ch==1)
				{
					Collections.sort(sts,new RollNoSorting());	
				}
				else if(ch==2)
				{
					Collections.sort(sts,new NameSort());
					
				}
				else if(ch==3)
				{
					Collections.sort(sts,new SalarySort());
				}     
   
	}

}
