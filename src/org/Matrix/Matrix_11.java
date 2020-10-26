package org.Matrix;
/*WAJPT define a method to find summation of row wise and column wise...*/

import java.util.Scanner;
public class Matrix_11 {
	static Scanner sc=new Scanner(System.in);
	static int [][] createMatrix(){
		System.out.println("Enter the no. of rows that you want for matrix");
		int row= sc.nextInt();
		System.out.println("Enter the no. of column that you want for matrix");
		int column= sc.nextInt();
		
		System.out.println("Enter "+row*column+" element");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
	static void displayMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void sumRowCol(int a[][]) {
		int row=a.length;
		int cols=a[0].length;
		for(int i=0;i<row;i++) {
			int sum_row=0;
			for(int j=0;j<cols;j++) {
				sum_row=sum_row+a[i][j];
			}
			System.out.println("sum of "+(i+1)+" row is: "+sum_row);
		}
		for(int i=0;i<cols;i++) {
			int sum_cols=0;
			for(int j=0;j<row;j++) {
				sum_cols=sum_cols+a[j][i];
			}
			System.out.println("sum of "+(i+1)+" column is: "+sum_cols);
		}
	}
	public static void main(String[] args) {
		int x[][]=createMatrix();
		System.out.println("given matrix is...");
		Matrix_11.displayMatrix(x);
		
		System.out.println();
		Matrix_11.sumRowCol(x);
		
	}

}
