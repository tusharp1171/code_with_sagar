package com.collectonprogramss;

import java.util.ArrayList;
import java.util.Collections;

public class SortingMethods {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("sagar");
	al.add("mahesh");
	al.add("sahil");
	al.add("akash");

	System.out.println(al);
	Collections.sort(al,Collections.reverseOrder());

	System.out.println("Reverse of List: "+al);
}
}
