package org.pattern;

import java.util.Scanner;

public class Pattern21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {    
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++) {
				System.out.print(k+" ");
			}
			System.out.println();
			
		}
	}

}
