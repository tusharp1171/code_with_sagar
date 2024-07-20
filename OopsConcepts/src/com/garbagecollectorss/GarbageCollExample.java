package com.garbagecollectorss;

public class GarbageCollExample {
	public void finalize()
	{
		System.out.println("call to gc");
	}
public static void main(String[] args) {
	GarbageCollExample g1=new GarbageCollExample();
	GarbageCollExample g2=new GarbageCollExample();
	g1=null;
	g2=null;
	
	System.gc();
	System.out.println(g1+""+g2);
	
}
}
