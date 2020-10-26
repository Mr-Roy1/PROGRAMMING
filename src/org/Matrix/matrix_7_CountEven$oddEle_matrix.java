package org.Matrix;
/*....WAJP read the matrix elements from the user and print how many even and odd elements present...*/
import java.util.Scanner;

public class matrix_7_CountEven$oddEle_matrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column: ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println("Enter "+row*column+" element row wise...");
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
		
		int evenNo=0,oddNo=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(mat[i][j]%2==0)
					evenNo++;
				else
					oddNo++;
			}
		}
		System.out.println("No. Even element present in matrix is: "+evenNo);
		System.out.println("No. Odd element present in matrix is: "+oddNo);
	}
}
