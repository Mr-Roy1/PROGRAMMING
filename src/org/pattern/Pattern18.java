package org.pattern;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {    //check at j<n
				System.out.print(" ");//space
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");//stars
			}
			System.out.println();
			
		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;j++) {    //check at j<n
//				System.out.print(" ");//space
//			}
//			for(int k=1;k<=2*i-1;k++) {
//				System.out.print("*");//stars
//			}
//			System.out.println();
//			
//		}
	}

}
