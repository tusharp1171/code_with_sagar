package com.map11;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
public static void main(String[] args) {
	HashMap<Integer, String> map=new HashMap<>();
	                       map.put(1, "Pune");
	                       map.put(2, "satara");
	                       map.put(4, "mumbai");
	                      
	                       map.put(3, "dhule");
	                       map.put(null, null);
	                       map.put(9, null);
	                       map.put(10, null);
	                       System.out.println(map);
	                       
	                    //   map.remove(1);
	                   //    System.out.println(map);
	                       
	                       for(Map.Entry<Integer, String> entry1 :map.entrySet() )
	                       {
	                    	   System.out.println("Key :"+entry1.getKey()+" Value :"+entry1.getValue());
	                       }
	                       
}
}
