package org.Matrix;
/*...WAJP read the matrix elements from the user and print the how many prime numbers present...*/
import java.util.Scanner;

public class matrix_8_CountPrimeNo_InMatrix {
	static boolean isPrime(int x) {
		if(x<=1) 
			return false;
		
		int i=2;
		while(i<=x/2) {
			if(x%i==0)
				return false;
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of rows and column: ");
		int row=sc.nextInt();
		int column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		System.out.println("Enter "+row*column+" Elements row wise...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		System.out.println("This is the Matrix...");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		int count=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				boolean rs=isPrime(mat[i][j]);
				if(rs==true)
				count++;
			}
		}
		System.out.println("No. of prime element present in matrix is: "+count);
	}
}
