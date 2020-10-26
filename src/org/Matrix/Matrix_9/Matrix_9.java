package org.Matrix.Matrix_9;
/*  WAJPT create and display the matrix...*/

import java.util.Scanner;
public class Matrix_9 {
	static Scanner sc=new Scanner(System.in);
//create the matrix...//
	static int[][] createMatrix(){
		System.out.println("Enter the no. of rows you want for the  matrix");
		int row=sc.nextInt();
		System.out.println("Enter the no. of column you want for matrix");
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
//display the matrix...//
	static void displayMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
