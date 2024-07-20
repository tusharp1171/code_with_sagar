package com.map11;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMap1 {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> lkmap=new LinkedHashMap<>();
	lkmap.put(1, "Pune");
	lkmap.put(2, "satara");
	lkmap.put(4, "mumbai");
   
	lkmap.put(3, "dhule");
	lkmap.put(null, null);
	lkmap.put(9, null);
	lkmap.put(10, null);
    System.out.println("lkd hash map is :"+lkmap);
    
    TreeMap<Integer, String> treemap=new TreeMap<>();
    treemap.put(1, "Pune");
    treemap.put(2, "satara");
    treemap.put(4, "mumbai");
    treemap.put(10, null);
    treemap.put(3, "dhule");
   // treemap.put(null, null);
    treemap.put(9, null);
 
    System.out.println("tree map is :"+treemap);
}
}
