package org.ARRAY;
/* WAJP to read the element from the user and print the sum of even and odd 
 * element */
import java.util.Scanner;

public class Array_3_SumOf_Even$Odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int esum=0,osum=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				esum=esum+ar[i];
			else
				osum=osum+ar[i];
		}
		System.out.println("Sum of even ele is: "+esum);
		System.out.println("Sum of odd ele is: "+osum);
	}
}
