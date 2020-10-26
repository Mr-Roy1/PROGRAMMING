package org.Matrix;
/*...WAJPT define a methods to rotate the given matrix into 90 degree left and 90 degree right...*/

public class Matrix_22_RotateMatrix {
	
	static int[][] rotate90Left(int x[][]){
		x=transpose(x);
		reverseColWise(x);
		return x;
	}
	static int [][] rotate90Right(int x[][]){
		x=transpose(x);
		reverseRowWise(x);
		return x;
	}
	static int[][] transpose(int x[][]){
		int nmat[][]=new int [x[0].length][x.length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				nmat[j][i]=x[i][j];
			}
		}
		return nmat;
	}
	static void reverseRowWise(int x[][]) {
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length/2;j++) {
				
				int t=x[i][j];
				x[i][j]=x[i][x[0].length-1-j];
				x[i][x[0].length-1-j]=t;
			}
		}
	}
	static void reverseColWise(int x[][]) {
		for(int i=0;i<x.length/2;i++) {
			for(int j=0;j<x[0].length;j++) {
				
				int t=x[i][j];
				x[i][j]=x[x.length-1-i][j];
				x[x.length-1-i][j]=t;
			}
		}
	}
	public static void main(String[] args) {
		int mat[][]= {{2,3,4},{5,6,7},{8,9,1}};
		System.out.println("origianal matrix");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int lrmat[][]=rotate90Left(mat);
		int rrmat[][]=rotate90Right(mat);
		
		System.out.println("Rotate 90 degree  left");
		for(int i=0;i<lrmat.length;i++) {
			for(int j=0;j<lrmat[i].length;j++) {
				System.out.print(lrmat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Rotate 90 degree  right");
		for(int i=0;i<rrmat.length;i++) {
			for(int j=0;j<rrmat[i].length;j++) {
				System.out.print(rrmat[i][j]+" ");
			}
			System.out.println();
		}
	}
}
