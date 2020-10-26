package org.pattern;


import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of lines");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=i;j<=n;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i;i++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		
	}

}
