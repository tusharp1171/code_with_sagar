package com.logicalPrograms;

public class PrimeNum {
	  public static void main(String[] args) {
	        int num = 100;
	        int count=0;
	        System.out.println("Prime numbers between 1 and " + num + " are:");
	        for (int i = 2; i <= num; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < i; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	            	 count++;
	                 System.out.println(i);
	             }
	         }
	         System.out.println("Total prime numbers found: " + count);
	     }
	 }