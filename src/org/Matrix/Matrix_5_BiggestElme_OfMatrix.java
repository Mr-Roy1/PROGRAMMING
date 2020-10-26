package org.Matrix;
/*...WAJP read the matrix elements from the user and print the biggest of those element...*/
import java.util.Scanner;

public class Matrix_5_BiggestElme_OfMatrix {
	static int  biggestEle(int x[][]) {
		int big=x[0][0];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(big<x[i][j])
					big=x[i][j];
			}
		}
		return big;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column: ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println("Enter "+row*column+" Element row wise...");
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
		
		int biggest=biggestEle(mat);
		System.out.println("Biggest element if Matrix is: "+biggest);
	}
}
