package org.Matrix;
/*... WAJPT define a method to return row wise biggest element...*/

import java.util.Scanner;

public class Matrix_12_RowWIseBig {
	static int [] rowBiggestMat(int x[][]) {
		int b[]=new int[x.length];
		
		for(int i=0;i<x.length;i++) {
			b[i]=x[i][0];
			for(int j=1;j<x[i].length;j++) {
				if(b[i]<x[i][j])
					b[i]=x[i][j];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row and element of matrix...");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		System.out.println("enter "+row*column+" element...");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("This is your matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int big[]=rowBiggestMat(mat);
		for(int i=0;i<big.length;i++) {
			System.out.println((i+1)+" row biggest element is: "+big[i]);
		}
	}
}
