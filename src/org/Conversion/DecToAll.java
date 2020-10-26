package org.Conversion;

import java.util.Scanner;

public class DecToAll {
	
	 static String dec2Bin(int dec) {
		String bin="";
		while(dec!=0) {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}
		return bin;
	}
	 static String dec2Oct(int dec) {
		String oct="";
		while(dec!=0) {
			int r=dec%8;
			oct=r+oct;
			dec=dec/8;
		}
		return oct;
	}
	 static String dec2Hex(int dec) {
		String hex="";
		while(dec!=0) {
			int r=dec%16;
			if(r<10)
				hex=r+hex;
			else
				hex=(char)(r+55)+hex;
			dec=dec/16;
		}
		return hex;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Decimal no.");
		int n=sc.nextInt();
		
		String binary=dec2Bin(n);
		String octal=dec2Oct(n);
		String hexadecimal=dec2Hex(n);
		
		System.out.println("dec to binary conversion of: "+n+" is "+binary);
		System.out.println("dec to octal conversion of: "+n+" is "+octal);
		System.out.println("dec to hexadecimal conversion of: "+n+" is "+hexadecimal);
	}
}
