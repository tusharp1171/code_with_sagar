package com.collectionclasss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String[] args) {
		List<String> ls=new ArrayList<>();
		ls.add("pqr");
		ls.add("abc");
		
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println(ls);
		Collections.addAll(ls, "def","sad");
		System.out.println(ls);
		List<Integer> ls1=new ArrayList<>();
		ls1.add(22);
		ls1.add(12);
		ls1.add(32);
		
		System.out.println(Collections.max(ls1));
	}
}
