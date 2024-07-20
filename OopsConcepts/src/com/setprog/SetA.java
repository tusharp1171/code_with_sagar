package com.setprog;

import java.util.*;
public class SetA {
   public static void main(String[] args) {
	Set<String> set=new HashSet<>();
	           set.add("abc");
	           set.add("pqr");
	           set.add("abc");
	           set.add(null);
	           System.out.println(set);
	           set.clear();
	   SortedSet<String > ss=new TreeSet<>(); 
	            ss.add("sagar");
	            ss.add("mahesh");
	            ss.add("samir");
	            ss.add("sahil");
	            ss.add("umesh");
	            ss.add("Ravi");
	          //  ss.add(null);
	            
	            System.out.println("tree set:"+ss);
	            System.out.println(ss.first());
	            System.out.println(ss.last());
	            System.out.println(ss.tailSet("umesh"));
	                                          
	            
	           System.out.println(set);
	          int  count= set.size();
	          
	           System.out.println(count);
	           for(String s2 :set)
	           {
	        	   System.out.println(s2);
	           }
}
}
