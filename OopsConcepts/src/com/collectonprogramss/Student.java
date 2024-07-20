package com.collectonprogramss;

import java.util.ArrayList;
import java.util.Collections;


//comparable

public class Student implements Comparable<Student>{

	private int no;
	private String name;  //setter/getter
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student ss) {
		// TODO Auto-generated method stub
		return this.name.compareTo(ss.name);//
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		        s.setNo(1);
		        s.setName("sagar");
		        
		        Student s1=new Student();
		        s1.setNo(4);
		        s1.setName("akash");
		        
		        Student s2=new Student();
		        s2.setNo(2);
		        s2.setName("umesh");
		        
		       ArrayList<Student> al=new ArrayList<>();
		                         al.add(s);
		                         al.add(s1);
		                         al.add(s2);
		                         
		                Collections.sort(al); 
		              
		             for(Student student:al)   
		             {
		            	 System.out.println(student.getNo()+":"+student.getName()); 
		             }
		        
		        
	}

}
