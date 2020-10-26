package org.Matrix.Matrix_10;
/*   WAJPT create and display the matrix along with add the element of that matrix... */

import java.util.Scanner;
public class Matrix_10 {
	static Scanner sc=new Scanner(System.in);
//create the matrix
	static int [][] createMatrix(){
		System.out.println("Enter the no. of row you want for matrix ");
		int row=sc.nextInt();
		System.out.println("Enter the no.of column you want for matrix");
		int column=sc.nextInt();
		
		System.out.println("Enter "+row*column+" element");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		return mat;
	}
//display the matrix
	static void displayMatrix(int mat[][]) {
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
//matrix addition
	static int[][] addMatrix(int a[][],int b[][]){
		int addmat[][]=new int[a.length][b.length];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				addmat[i][j]=a[i][j]+b[i][j];
			}
		}
		return addmat;
	}
}
