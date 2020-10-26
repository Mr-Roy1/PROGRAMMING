package org.Matrix.Matrix_9;

public class CheckMatrix {
	public static void main(String[] args) {
		System.out.println("Program to create and display the matrix...");
		int createmat[][]=Matrix_9.createMatrix();
		
		System.out.println("the given matrix is: ");
		Matrix_9.displayMatrix(createmat);
		
	}

}
