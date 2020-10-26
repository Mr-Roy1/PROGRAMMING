package org.pattern;

import java.util.Scanner;

public class Pattern33_RightTraingle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of lines");
	    int n=sc.nextInt();
	    int k=1;
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(k%2+" ");
	    		k++;
	    	}
	    	System.out.println();
	    }
	}
}

