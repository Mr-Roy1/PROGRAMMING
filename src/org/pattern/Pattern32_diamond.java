package org.pattern;

import java.util.Scanner;

public class Pattern32_diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n=sc.nextInt();
        
//        for(int i=1;i<=n;i++) {
//        	for(int j=1;j<=n-i;j++) {
//        		System.out.print("  ");
//        	}
//        	for(int j=1;j<=2*i-1;j++) {
//        		System.out.print("* ");
//        	}
//        	System.out.println();
//        }
//        for(int i=n-1;i>=1;i--) {
//        	for(int j=n-1;j>=i;j--) {
//        		System.out.print("  ");
//        	}
//        	for(int j=1;j<=2*i-1;j++) {
//        		System.out.print("* ");
//        	}
//        	System.out.println();
//        }
        
        //SECOND METHOD
        int sp=n/2,st=1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;j<=sp;j++) {
        		System.out.print("  ");
        	}
        	for(int j=1;j<=st;j++) {
        		System.out.print("* ");
        	}
        	if(i<=n/2) {
        		sp--;
        		st=st+2;
        	}
        	else {
        		sp++;
        		st=st-2;
        	}
        	System.out.println();
        }
        
        
        
        
	}

}
