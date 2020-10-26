package org.ARRAY;
/* WAJP to read the element from the user and print the how many prime element 
 * present in the array */

import java.util.Scanner;

public class Array_8_PrimeEle {
	static boolean isPrime(int x) {
		if(x<=1)
			return false;
		
		int i=2;
		while(i<=x/2) {
			if(x%i==0)
				return false;
			i++;
		}
			return true;
	}
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the size of the array: ");
       int n=sc.nextInt();
       int ar[]=new int	[n];
       System.out.println("enter "+n+" element");
       for(int i=0;i<n;i++) {
    	   ar[i]=sc.nextInt();
       }
       int pno=0;
       for(int i=0;i<ar.length;i++) {
    			 boolean pp=isPrime(ar[i]);
    			 if(pp==true)
    			 pno++;
    	   }
       System.out.print("Number of prime ele is: "+pno);
       }
	}

