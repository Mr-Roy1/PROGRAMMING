package org.ARRAY;
/*WAJP to read the element from the user and print the summation of the element of array*/

import java.util.Scanner;

public class Array_1_SumOf_Ele {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("user entered no is...");
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		System.out.println("sum of this array element is: "+sum);
	}
}
