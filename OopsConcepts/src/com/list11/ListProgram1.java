package com.list11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ListProgram1 {
	public static void main(String[] args) {
		
		/*
		 * List<String> ls=new ArrayList<>(); ls.add("pqr"); ls.add("abc");
		 * ls.add("ifd"); System.out.println(ls); ls.remove(0); System.out.println(ls);
		 * // ls.clear(); // System.out.println(ls); int counts= ls.size();
		 * System.out.println(counts); ls.add(new Student(1,"sujeet",'A',2000.00))
		 */
		              
		             List lsStu=new ArrayList<>();
		                           lsStu.add("sagar");
		                           lsStu.add(10);
		                           lsStu.add("sagar");
		                           lsStu.add('A');
		                           System.out.println(lsStu);   
		                           
		                   Iterator itr=  lsStu.iterator();
		                   while(itr.hasNext())
		                   {
		                	  Object s= itr.next();
		                	  
		                	   System.out.println(s);
		                   }
		                   
		            List<String> lsCity=new ArrayList<>();
		                         lsCity.add("pune");
		                         lsCity.add("satara");
		                         lsCity.add("mumbai");
		                         System.out.println(lsCity);
		                         
		                         Iterator itr1=lsCity.iterator();
		                         while(itr1.hasNext())
		                         {
		                        	 String s1=(String) itr1.next();
		                        	 System.out.println(s1);
		                         }
		                         // what is type cast
		                         //converting larger to small=norrowing casting-manually
		                         //converting smaller to larher data type =widening casting-automatic
		                          for(String city:lsCity)
		                          {
		                        	  System.out.println(city);
		                          }
		                          
		                          List<List<String>> llss=new ArrayList<>(); 
		                                            
		                                             llss.add(lsCity);
		                                  Iterator  itr2=llss.iterator();
		                                  while(itr2.hasNext())
		                                  {
		                                	  
		                                	  List<String> ssa= (List<String>) itr2.next();
		                                	  Iterator  itr21=ssa.iterator();
		                                	  while(itr21.hasNext())
			                                  {
		                                		  String s=(String) itr21.next();
		                                	  System.out.println(s);
			                                  }
		                                  }
		                                  
		                                  //
		                                  
		                                  for(List<String> lsd:llss)
		                                  {
		                                	  
		                                	  //System.out.println(lsd);
		                                	  for(String sf:lsd)
		                                	  {
		                                		  System.out.println(sf);
		                                	  }
		                                  }
		                                  
		             
	}
	}
