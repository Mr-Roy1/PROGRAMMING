package org.Matrix;
/*...WAJPT define a method to transpose the given matrix ...*/

public class Matrix_21_Transpose {
	
	static int [][] transpose(int x[][]){
		int nmat[][]=new int[x[0].length][x.length];
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[0].length;j++) {
				nmat[j][i]=x[i][j];
			}
		}
		return nmat;
	}
	public static void main(String[] args) {
		int mat[][]= {{1,2,3},{7,8,9},{4,5,6}};
		System.out.println("Before Transpose");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		int pp[][]=transpose(mat);
		System.out.println("After Transpose");
		for(int i=0;i<pp.length;i++) {
			for(int j=0;j<pp[i].length;j++) {
				System.out.print(pp[i][j]+" ");
			}
			System.out.println();
		}

	}

}
