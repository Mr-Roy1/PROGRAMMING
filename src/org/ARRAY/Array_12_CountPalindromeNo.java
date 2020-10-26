package org.ARRAY;
/*WAJPT count how many Palindrome no present in the array*/

import java.util.Scanner;

public class Array_12_CountPalindromeNo {
	static boolean isPalindrome(int x) {
		int t=x;
		int reverse=0;
		while(x!=0) {
			int r=x%10;
			reverse=reverse*10+r;
			x=x/10;
		}
		if(t==reverse)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of size: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Elements..." );
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean pp=isPalindrome(ar[i]);
			if(pp==true)
				count++;
		}
		System.out.print("Number of Palindrome no is: "+count);

	}

}
