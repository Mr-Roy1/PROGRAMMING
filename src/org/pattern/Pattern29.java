package org.pattern;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        int k=1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=n-i;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=2*i-1;j++) {
        				if(k>=10) {
        					k=1;
        					System.out.print(k+" ");
        					k++;
        				}
        				else {
        					System.out.print(k+" ");
        					k++;
        				}
        	 }
        	System.out.println();
        }
	}
}
