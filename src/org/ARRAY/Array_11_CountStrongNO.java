package org.ARRAY;

import java.util.Scanner;

/* WAJPT count how many strong numbers present in the array?*/
public class Array_11_CountStrongNO {
	
	static boolean isStrong(int x) {
		int sum=0;
		int t=x;
		while(x!=0) {
			int r=x%10;
			  int fact=1;
			while(r>1) {
				fact=fact*r;
				r--;
			}
			sum=sum+fact;
			x=x/10;
		}
		if(sum==t)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of size: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Elements...");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean pp=isStrong(ar[i]);
			if(pp==true)
				count++;
		}
		System.out.println("Number of Strong no is: "+count);
	}
}
