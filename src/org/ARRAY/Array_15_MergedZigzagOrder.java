package org.ARRAY;
/* WAJPT merge two array element in zigzag order*/
import java.util.Scanner;

public class Array_15_MergedZigzagOrder {
	static int[] mergeZigzag(int x[],int y[]) {
		int z[]=new int[x.length+y.length];
		int i=0,k=0;
		while(i<x.length && i<y.length) {
			z[k]=x[i];
			k++;
			z[k]=y[i];
			k++;
			i++;
		}
		while(i<x.length) {
			z[k]=x[i];
			i++;
			k++;
		}
		while(i<y.length) {
			z[k]=y[i];
			i++;
			k++;
		}
		return z;
		
		
//		int z[]=new int[x.length+y.length];
//		int j=0;
//		for(int i=0;i<z.length;) {
//			if(j<x.length) {
//				z[i]=x[j];
//				i++;
//			}
//			if(j<y.length) {
//				z[i]=y[j];
//				i++;
//			}
//			j++;
//		}
//		
//		
//		return z;
		
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
 		System.out.println("Enter the element of first Array");
 		int a[]=readArray();
 		System.out.println("Enter the element of second array ");
 		int b[]=readArray();
 		
 		int c[]=mergeZigzag(a,b);
 		for(int i=0;i<c.length;i++) {
 			System.out.print(c[i]+" ");
 		}
		
		
	}
}
