package com.collectionclasss;

import java.util.Comparator;

public class RollN0 implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getRollNo()- o2.getRollNo();
	}

}
