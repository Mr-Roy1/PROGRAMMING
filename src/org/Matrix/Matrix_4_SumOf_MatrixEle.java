package org.Matrix;
/*... WAJP read the matrix elements from the user and print the sum of those elements...*/
import java.util.Scanner;

public class Matrix_4_SumOf_MatrixEle {
	static int sumOfMatrix(int x[][]) {
		 int sum=0;
			for(int i=0;i<x.length;i++) {            
				for(int j=0;j<x[i].length;j++) {
					sum=sum+x[i][j];
				}
			}
			return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column: ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println("Enter "+row*column+" element row 3wise...");
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
		
		int summation=sumOfMatrix(mat);
		System.out.println("Sum of matrix element: "+summation);
	}
}
