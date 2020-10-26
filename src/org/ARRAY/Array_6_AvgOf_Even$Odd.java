package org.ARRAY;
/* WAJP to read the element from the user and print the Average of even and odd no*/
import java.util.Scanner;

public class Array_6_AvgOf_Even$Odd {

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
		int ecount=0,ocount=0;
		int avg1=0,avg2=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0) {
				esum=esum+ar[i];
			     ecount++;
			     avg1=esum/ecount;
			
			}
			
			else {
				osum=osum+ar[i];
			     ocount++;
			   avg2=osum/ocount;
			}
			
		}
		System.out.println("Avg of even element is: "+avg1);
		System.out.println("Avg of odd element is: "+avg2);
	}

}
