package org.Matrix;
/*...WAJPT define a method to return row wise sum...*/

import java.util.*;
public class Matrix_18_RowWiseSum {
	static int [] sumRowWise(int x[][]) {
		int sum[]=new int[x.length];
		for(int i=0;i<x.length;i++) {
			 sum[i]=0;
			for(int j=0;j<x[i].length;j++) {
				
				sum[i]=sum[i]+x[i][j];
			}
		}
		return sum;
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
		System.out.println("This is the matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		int summation[]=sumRowWise(mat);
		for(int i=0;i<summation.length;i++) {
			System.out.println(i+1+" row elements sum is: "+summation[i]);
		}
	}
}
