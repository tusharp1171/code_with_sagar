package com.collectonprogramss;

import java.util.*;

public class SortingWrapperClass {          
  public static void main(String[] args) {
	ArrayList ls=new  ArrayList<>();
	         ls.add(Integer.valueOf(110));
	         ls.add(Integer.valueOf(200));
	         ls.add(Integer.valueOf(90));
	         ls.add(230);//internally convert
	         
	         System.out.println(ls);
	         Collections.sort(ls);
	         System.out.println("after sorting :"+ls);
}        
          
}
