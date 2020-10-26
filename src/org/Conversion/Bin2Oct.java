package org.Conversion;

import java.util.Scanner;

public class Bin2Oct {
	static int bin2dec(int bin) {
		int dec=0;
		int p=1;
		while(bin!=0) {
			int r=bin%10;
			dec=dec+r*p;
			p=p*2;
			bin =bin/10;
		}
		return dec;
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary no.");
		int n=sc.nextInt();
		
		int binary2dec=bin2dec(n);
		String decimal2oct=dec2Oct(binary2dec);
		
		System.out.println("binary to octal conversion of: "+n+ " is "+decimal2oct);
	}
}
