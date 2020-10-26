package org.Matrix;
/*...WAJPT define a method to reverse column elements...*/

import java.util.*;

public class Matrix_15_RevColEle {
	
	static void revColWise(int x[][]) {
		for(int i=0;i<x.length/2;i++) {
			for(int j=0;j<x[0].length;j++) {
				
				int t=x[i][j];
				x[i][j]=x[x.length-1-i][j];
				x[x.length-1-i][j]=t;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		System.out.println("Enter "+row*column+ " Elements...");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("Before reverse...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("------------------------------------------");
			revColWise(mat);
			
			System.out.println("After reverse...");
			for(int i=0;i<mat.length;i++) {
				for(int j=0;j<mat[i].length;j++) {
					System.out.print(mat[i][j]+" ");
				}
				System.out.println();
			}
	}
}
