package com.comparatorss;

import java.util.Comparator;

public class RollNoSorting implements Comparator<Student> {

	@Override
	public int compare(Student r1, Student r2) {
		// TODO Auto-generated method stub
		return r1.getRollNo()-r2.getRollNo();
	}
	
	

}
