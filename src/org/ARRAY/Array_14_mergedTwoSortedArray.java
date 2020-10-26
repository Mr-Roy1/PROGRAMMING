package org.ARRAY;
/* WAJPT merge two sorted array elements in sorted order*/
import java.util.Scanner;

public class Array_14_mergedTwoSortedArray {
	static int [] mergeSortedArr(int x[],int y[]) {
		int z[]=new int[x.length+y.length];
		int i=0,j=0,k=0;
		while(i<x.length && j<y.length) {
			if(x[i]<y[j]) {
				z[k]=x[i];
				i++;
				k++;
			}
			else  {
				z[k]=y[j];
				j++;
				k++;
			}
		}
		while(i<x.length) {
			z[k]=x[i];
			i++;
			k++;
		}
		while(j<y.length) {
			z[k]=y[j];
			j++;
			k++;
		}
		return z;
	}
	static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		return ar;
		
	}

	public static void main(String[] args) {
		System.out.println("Enter first array element");
		int a[]=readArray();
		System.out.println("Enter second array element");
		int b[]=readArray();
		
		int c[]=mergeSortedArr(a,b);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
	}

}
