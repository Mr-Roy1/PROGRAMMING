package org.Matrix;
/*...WAJP read the matrix elements from the user and print the smallest of those elements...*/
import java.util.Scanner;

public class matrix_6_SmallestEle_Ofmatrix {
	static int smallestEle(int x[][]) {
		int small=x[0][0];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(small>x[i][j])
					small=x[i][j];
			}
		}
		return small;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column: ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println("Enter "+row*column+" Elements row wise...");
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
		
		int smallest=smallestEle(mat);
		System.out.println("smallest element in matrix is: "+smallest);
	}
}
