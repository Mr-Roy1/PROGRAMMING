package org.ARRAY;
/* WAJP to read the element from the user and print the how many perfect element 
 * present in the array */
import java.util.Scanner;

public class Array_7_PerfectEle {
	static boolean  isPerfect(int x) {
		
		int sum=0;
		int i=1;
		while(i<=x/2) {
			if(x%i==0)
				sum=sum+i;
			i++;
		}
		if(x==sum)
			return true;
		else
			return false;
	    }
 	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the "+n+" element");
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean rs=isPerfect(ar[i]);
			if(rs==true)
				count++;
			}
		System.out.println("No of perfect numbers: "+count);
				
		}
	}


