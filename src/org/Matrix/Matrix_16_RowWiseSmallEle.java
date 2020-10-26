package org.Matrix;
/*WAJPT define a method to return row wise smallest element*/

import java.util.Scanner;

public class Matrix_16_RowWiseSmallEle {
	
	static int [] rowWiseSmallest(int x[][]) {
		int s[]=new int[x.length];
		for(int i=0;i<x.length;i++) {
			s[i]=x[i][0];
			for(int j=1;j<x[i].length;j++) {
				if(s[i]>x[i][j])
					s[i]=x[i][j];
			}
		}
		return s;
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
		int small[]=rowWiseSmallest(mat);
		for(int i=0;i<small.length;i++) {
			System.out.println(i+1+" row wise smallest ele is: "+small[i]);
		}
		
	}
}
