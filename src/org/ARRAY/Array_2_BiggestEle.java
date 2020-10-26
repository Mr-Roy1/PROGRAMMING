package org.ARRAY;

import java.util.Scanner;
/* WAJP to read the element from the user and print the biggest element of the ARRAY*/
public class Array_2_BiggestEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int big=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(big<ar[i])
			 big=ar[i];
		}
		System.out.println("Biggest ele is: "+big);
	}
}



		