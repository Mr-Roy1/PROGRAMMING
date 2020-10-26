package org.Matrix;
/*...WAJPT define a method to reverse row elements...*/
import java.util.*;
public class matrix_14_RevRowEle {
	
	static void revRowWise(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length/2;j++) {
				
				int t=x[i][j];
				x[i][j]=x[i][x[0].length-1-j];
				x[i][x[0].length-1-j]=t;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column...");
		int row=sc.nextInt();
		int column=sc.nextInt();

		System.out.println("Enter "+row*column+" Elements...");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("this is matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");
		revRowWise(mat);
		
		System.out.println("After reverse....");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
