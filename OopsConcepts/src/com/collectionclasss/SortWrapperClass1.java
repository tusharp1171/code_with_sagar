package com.collectionclasss;

import java.util.ArrayList;
import java.util.Collections;

public class SortWrapperClass1 {
public static void main(String[] args) {
	ArrayList al =new ArrayList();
	al.add(Integer.valueOf(211));
	al.add(Integer.valueOf(320));
	al.add(230);
	System.out.println(al);
	
	Collections.sort(al);
	System.out.println(al);
}
}
