package com.collectonprogramss;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsClassExpl {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("sagar");
		al.add("mahesh");
		al.add("sahil");
		al.add("akash");

		System.out.println(al);

		Collections.sort(al);
		System.out.println("collections class used after sorting :" + al);
		Collections.addAll(al, "ravi", "tejas");

		System.out.println("addAll :" + al);

		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(5);
		al1.add(2);
		al1.add(10);
		al1.add(6);
		System.out.println("integer:" + al1);
		Collections.sort(al1);
		System.out.println("integer after sortng:" + al1);
		System.out.println(Collections.max(al1));
		
		
		
	}
}
