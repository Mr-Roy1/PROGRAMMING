package org.pattern;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        
//        for(int i=1;i<=n;i++) {
//        	for(int j=1;j<=n-i;j++) {
//        		System.out.print("  ");
//        	}
//        	for(int j=i;j<=i;j++) {
//        		System.out.print(i%2+" ");
//        	}
//        	for(int j=i+1;j<=(3*i-1)-1;j++) {
//        		System.out.print(j%2+" ");
//        	}
//        	System.out.println();
//        }
        
        //second method
        int k=1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n-i;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=2*i-1;j++) {
       		System.out.print(k%2+" ");
       		k++;
        	}
        	System.out.println();
        
	}
	}
}
