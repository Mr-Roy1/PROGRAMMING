package org.ARRAY;

import java.util.Scanner;

/* WAJP to read the element from the user and print the smallest element in the array*/
public class Array_4_SmallestEle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int small=ar[0];
		for(int i=0;i<ar.length;i++) {
			if(small>ar[i])
				small=ar[i];
		}
		System.out.println("Smallest ele is: "+small);
	}

}
