package org.ARRAY;
/* WAJP to read the element from the user and print the count of even and odd element 
 * present in the array*/
import java.util.Scanner;

public class Array_5_Count_Even$Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int ecount=0,ocount=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				ecount++;
			else
				ocount++;
		}
		System.out.println("Number of even no. is: "+ecount);
		System.out.println("Number of odd no. is: "+ocount);
	}

}
