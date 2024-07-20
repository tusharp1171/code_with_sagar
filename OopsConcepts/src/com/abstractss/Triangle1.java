package com.abstractss;

public class Triangle1 {

	public static void main(String[] args) {
		int i,k,j;
		int count=1;
		for ( i = 0; i < 5; i++) {
			for ( j = 5 - i; j >= 0; j--) {
				System.out.print(" ");
				//a++;
			}
			
			for ( k = 0; k < (2 * i + 1); k++) {
              
				//k++;
				System.out.print(count+"  ");
				count++;
				//k++;
				//a++;

			}
			System.out.println();
			
		}

	}

}
