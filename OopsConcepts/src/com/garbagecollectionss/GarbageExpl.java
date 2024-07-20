package com.garbagecollectionss;

public class GarbageExpl {
public void finalize()
{
System.out.println("garbage collector call");	
}

public static void main(String[] args) {
	GarbageExpl g1=new GarbageExpl();
	        g1=null;
	        
	      //  System.out.println(g1);
	        System.gc();
	
}
}
