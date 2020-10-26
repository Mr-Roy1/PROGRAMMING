package org.ARRAY;

import java.util.Scanner;

/*WAJP to count and return how many times specified element is present in the array*/
public class Array_18_CountSameEle {
	static int countArray(int x[],int ele) {
		int count=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]==ele)
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		System.out.println("Choose the Element to find repetation...");
		int n2=sc.nextInt();
		
		int c=countArray(ar,n2);
		System.out.println(n2+" present "+c+" times");
		

	}

}
