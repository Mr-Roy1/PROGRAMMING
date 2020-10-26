package org.ARRAY;
/*WAJPT define a method to check user entered element is present in that 
 * array or not*/

import java.util.*;
public class Array_10_ElementCheck {
	
	static int getIndexOf(int ele,int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(ele==arr[i])
				return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n= sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" elements");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("showing entered array...");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
 		System.out.print("user required element: ");
		int ele=sc.nextInt();
		
		int pp=getIndexOf(ele,ar);
		if(pp>=0)
			System.out.print("index is: "+pp);
		else
			System.out.print("index not found");
	}

}
