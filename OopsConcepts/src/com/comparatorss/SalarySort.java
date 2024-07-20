package com.comparatorss;

import java.util.Comparator;

public class SalarySort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()- o2.getSalary());
	}

}
