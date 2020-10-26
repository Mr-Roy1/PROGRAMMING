package org.Matrix.Matrix_10;

public class MatrixAddition {

	public static void main(String[] args) {
		System.out.println("Enter the details for the matrix");
		int mat1[][]=Matrix_10.createMatrix();
		int mat2[][]=Matrix_10.createMatrix();	
		
		int addmat1[][]=Matrix_10.addMatrix(mat1,mat2);
		System.out.println();
		System.out.println("Result of addition of two matrix");
		Matrix_10.displayMatrix(addmat1);
	}
}
