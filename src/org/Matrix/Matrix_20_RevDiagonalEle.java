package org.Matrix;
/*...WAJPT define a method to reverse diagonal elements...*/
import java.util.Scanner;

public class Matrix_20_RevDiagonalEle {
	
	static void revDiagonalEle(int x[][]) {
		for(int i=0;i<x.length/2;i++) {
			for(int j=0;j<x[i].length;j++) {
				
				if(i==j) {
				int t=x[i][j];
				x[i][j]=x[x.length-1-i][x[0].length-1-i];
				x[x[0].length-1-i][x.length-1-i]=t;
				}
				
				 if(i+j==x.length-1) {
					int t=x[i][j];
					x[i][j]=x[x.length-1-i][i];
					x[x.length-1-i][i]=t;
				}
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
		System.out.println("This is the matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
		revDiagonalEle(mat);
		
		System.out.println("After diagonal reverse...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
