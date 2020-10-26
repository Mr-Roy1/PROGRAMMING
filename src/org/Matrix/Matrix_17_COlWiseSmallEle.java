package org.Matrix;
/*...WAJPT define a method to return column wise smallest element...*/
import java.util.Scanner;

public class Matrix_17_COlWiseSmallEle {
	
	static int[] colWiseSmallest(int x[][]) {
		int s[]=new int[x[0].length];
		for(int i=0;i<x[0].length;i++) {
			s[i]=x[0][i];
			for(int j=1;j<x.length;j++) {
				if(s[i]>x[j][i])
					s[i]=x[j][i];
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
		int small[]=colWiseSmallest(mat);
		for(int i=0;i<small.length;i++) {
			System.out.println(i+1+" column wise smallest ele is: "+small[i]);
		}

	}

}
