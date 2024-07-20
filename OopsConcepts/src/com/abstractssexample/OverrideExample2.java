package com.abstractssexample;

public class OverrideExample2 extends OverloadingExample{

public void run() {
		
		System.out.println("run--child class method");
	}
public static void main(String[] args) {
	OverrideExample2 obj2=new OverrideExample2();
	        obj2.run();
}
}
