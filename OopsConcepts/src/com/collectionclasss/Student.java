package com.collectionclasss;

import java.util.ArrayList;
import java.util.Collections;


public class Student implements Comparable<Student> {

	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student s) {

		return name.compareTo(s.name);
	}

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

		ArrayList<Student> sstu = new ArrayList<Student>();
		sstu.add(s1);
		sstu.add(s2);
		sstu.add(s3);
		Collections.sort(sstu);
		for(Student s:sstu)
		{
			System.out.println(s.name+" :  and  :"+s.rollNo);
		}

	}

}
