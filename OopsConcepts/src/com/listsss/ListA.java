package com.listsss;

import java.util.*;

public class ListA {
	public static void main(String[] args) {
		List ls = new ArrayList<>();
		ls.add(10);
		ls.add("Logipool");
		ls.add(2000.00);
		ls.add('A');
	//	List<List<String >> lls=new ArrayList<>();
	//	List<List<List<String>>> llls=new ArrayList<>();
	//	System.out.println(ls);
	/*
	 * Iterator1 itr=ls.iterator(); while(itr.hasNext()) { Object s= itr.next();
	 * System.out.println(s); }
	 */
          
	/*
	 * for(List<String> obj:ls) { for(String obj1:obj) { System.out.println(obj); }
	 * 
	 * }
	 */
          
          int a=ls.size();
          System.out.println("size :"+a);
          ls.remove(3);
          System.out.println(ls);
          ls.clear();
          System.out.println(ls);
		List<String> ls1 = new ArrayList<>();
		ls1.add("Sagar");
		ls1.add("mahesh");
		ls1.add("shubham");
		System.out.println(ls1);
		
		LinkedList<String> ls2=new LinkedList<>();
		                   ls2.add("abc");
		                   ls2.add("pqr");
		                   System.out.println(ls2);
                            
		                   
		                   for(String s:ls2)
		                   {
		                	   System.out.println(s); 
		                   }
		                   
	}
}
