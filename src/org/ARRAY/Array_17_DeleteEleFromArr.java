package org.ARRAY;
/*WAJP to delete an element from the Array*/
import java.util.Scanner;
public class Array_17_DeleteEleFromArr {
	static int[] deleteArr(int x[],int index) {
		if(index<0 || index>x.length) {
			System.out.println("index not in the range");
			return null;
		}
		int z[]=new int[x.length-1];
		for(int i=0;i<x.length-1;i++) {
			if(i<index)
				z[i]=x[i];
			else
				z[i]=x[i+1];
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
	public static void main(String[] args) {
		System.out.println("Enter the Element of Array");
		int a[]=readArray();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the index no to delete: ");
		int index=sc.nextInt();
		
		int c[]=deleteArr(a,index);
		
		System.out.println("\n Before delete...");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();//for space purpose
		
		System.out.println("\n After Delete...");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}
}
