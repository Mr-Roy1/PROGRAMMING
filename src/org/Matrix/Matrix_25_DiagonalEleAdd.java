package org.Matrix;
/*WAJP TO define a method to return sum of diagonal elements of matrix...*/
public class Matrix_25_DiagonalEleAdd {
	
	static int[] addDiagonalEle(int x[][]) {
		int psum=0,ssum=0;
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				
				if(i==j)
					psum=psum+x[i][j];
				if(i+j==x.length-1)
					ssum=ssum+x[i][j];
			}
		}
		int sum[]= {psum,ssum};
		return sum;
	}
	public static void main(String[] args) {
        int mat[][]= {{1,2,3,4,5},{6,7,8,9,2},{8,9,5,7,3},{9,1,6,8,5},{7,3,6,4,8}};
        
        System.out.println("This is the origional matrix");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(); // FOR SPACE PURPOSE//
        
        int rs[]=addDiagonalEle(mat);
        System.out.println("Primary diagonal sum is: "+rs[0]);
        System.out.println("Secondary diagonal sum is: "+rs[1]);
        
	}
}
