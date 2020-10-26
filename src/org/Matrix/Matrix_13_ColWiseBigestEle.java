package org.Matrix;
/*...WAJPT define a method to find column wise biggest element...*/
import java.util.Scanner;

public class Matrix_13_ColWiseBigestEle {
	
	static int [] colWiseBiggest(int x[][]) {
		int b[]=new int[x[0].length];
		for(int i=0;i<x[0].length;i++) {
			b[i]=x[0][i];
			for(int j=1;j<x.length;j++) {
				if(b[i]<x[j][i])
					b[i]=x[j][i];
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of row and column");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		System.out.println("Enter "+row*column+" elements...");
		int mat[][]=new int[row][column];
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("This is matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int big[]=colWiseBiggest(mat);
		for(int i=0;i<big.length;i++) {
			System.out.println((i+1)+" column wise biggest element is: "+big[i]);
		}
	}
}
