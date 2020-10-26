package org.ARRAY;
/*WAJPT define a method to merge two array element into single array*/

import java.util.Scanner;

public class Array_9_MergetoArrayElement {
	
	static int[] merge(int x[],int y[]) {
		int z[]=new int[x.length+y.length];
		for(int i=0;i<x.length;i++) {
			z[i]=x[i];
		}
		for(int i=0;i<y.length;i++) {
			z[x.length+i]=y[i];
		}
		return z;
	}
	
	static int [] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}

	public static void main(String[] args) {
		System.out.println("Enter first array elemnts");
		int a[]=readArray();
		System.out.println("Enter second array");
		int b[]=readArray();
		
		int c[]=merge(a,b);
		System.out.println("after merging elements...");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}

	}

}
