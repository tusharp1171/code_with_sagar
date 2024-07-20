package com.setprog;

import java.util.ArrayList;
import java.util.*;

public class List2 {

	public static void main(String[] args) {
		List<String> ls1 = new ArrayList<>();
		ls1.add("sagar");
		ls1.add("umesh");

		List<String> ls2 = new ArrayList<>();
		
		ls2.add("sahil");
		ls2.add("ravi");
		
		List<List<String>> lls = new ArrayList<>();
		                   lls.add(ls1);
		                   lls.add(ls2);
		                   
		        System.out.println(lls);   
		        
		        for(List<String> lsa:lls)
		        {
		        	for(String s1:lsa)
		        	{
		        		System.out.println(s1);
		        	}
		        	
		        }
		     //  List<List<Set<String>>>  lls= new ArrayList<>();           
	}

}
