package org.Matrix;
/*WAJP to define a method to return clockwise spiral of matrix elements...*/
public class Matrix_23_ClockwiseSpiral {
	
	static void printSpiral(int x[][]) {
		for(int i=0,j=x.length-1;i<j;i++,j--) {
			for(int k=i;k<j;k++)
				System.out.print(x[i][k]+" ");
			
			for(int k=i;k<j;k++)
				System.out.print(x[k][j]+" ");
			
			for(int k=j;k>i;k--)
				System.out.print(x[j][k]+" ");
			
			for(int k=j;k>i;k--)
				System.out.print(x[k][i]+" ");
		}
		if(x.length%2==1)
			System.out.print(x[x.length/2][x.length/2]);
	}
	public static void main(String[] args) {
		int mat[][]= {{2,3,4,5,4},{3,4,5,6,7},{7,4,2,3,7},{5,6,4,7,9},{4,5,6,5,3}};
		
		System.out.println("This is the origional matrix");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(); // FOR SPACE PURPOSE//
		printSpiral(mat);
	}
}
