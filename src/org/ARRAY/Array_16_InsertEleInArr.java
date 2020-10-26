package org.ARRAY;

/*WAJP to define a method to insert an element  in Array*/
import java.util.Scanner;

public class Array_16_InsertEleInArr {
	static int[] insertArr(int x[],int ele,int index) {
		if(index<0||index>x.length) {
			System.out.println("index not in the range");
			return null;
		}
		int z[]=new int[x.length+1];
		z[index]=ele;
		for(int i=0;i<x.length;i++) {
			if(i<index)
				z[i]=x[i];
			else
				z[i+1]=x[i];
		}
		return z;
	}
	
	static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println("Enter the elements of array");
		int a[]=readArray();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the element:");
		int ele=sc.nextInt();
		System.out.print("Enter the no of index:");
		int index=sc.nextInt();
		
		int c[]=insertArr(a,ele,index);
		
		System.out.println("\n Before insetion...");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();//space purpose
		if(a==null)
			System.err.println("\n insertion is failed");
		else
			System.out.println("\n After insert:...");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
