package com.mapsss;

import java.util.*;
import java.util.Map.Entry;

public class MapA {
	public static void main(String[] args) {
		
		
		TreeMap<Integer, String> treemap = new TreeMap<>();
		treemap.put(1, "mumbai");
		treemap.put(6, "pune");
		treemap.put(3, "satara");
		treemap.put(2, "solapur");
		
		
		System.out.println("treemap"+treemap);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "mumbai");
		map.put(6, "pune");
		map.put(3, "satara");
		map.put(2, "solapur");
		map.put(null, null);
		
		// map.values();

		System.out.println("hashmap"+map);
		LinkedHashMap<Integer, Object> map1 = new LinkedHashMap<>();
		map1.put(1, "mumbai");
		map1.put(6, "pune");
		map1.put(4, "solapur");
		map1.put(2, "satara");

		System.out.println("LinkedHashMap"+map1);
//		Set set = map.entrySet();
//		Iterator itr = set.iterator();
//		while (itr.hasNext()) {
//			Map.Entry<Integer, String> entry = (Entry<Integer, String>) itr.next();
//			System.out.println(entry.getKey() + " :" + entry.getValue());
//		}

//	    for(Map.Entry<Integer, String> entry:map.entrySet())
//	    {
//	    	System.out.println("values: "+entry.getValue()+"and Key: "+entry.getKey());
//	    }
//	    System.out.println(map.size());
//	    map.remove(1);
//	    System.out.println(map);
//	    map.clear();
//	    System.out.println(map);
//	    

	}

}
