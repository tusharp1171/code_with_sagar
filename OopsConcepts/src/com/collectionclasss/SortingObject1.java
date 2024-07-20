package com.collectionclasss;

import java.util.ArrayList;
import java.util.Collections;

public class SortingObject1 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("abc");
	al.add("pqr");
	al.add("rsp");
	al.add("bsp");
	
	Collections.sort(al);
	System.out.println(al);
	for(String s:al)
	{
		System.out.println(s);
	}
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
}
}
