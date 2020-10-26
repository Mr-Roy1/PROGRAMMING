package org.Conversion;

import java.util.Scanner;

public class Oct2Bin {
	
	static int oct2Dec(int oct) {
		int dec=0;
		int p=1;
		while(oct!=0) {
			int r=oct%10;
			dec=dec+r*p;
			p=p*8;
			oct=oct/10;
		}
		return dec;
	}
	static String dec2Bin(int dec) {
		String bin="";
		while(dec!=0) {
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}
		return bin;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the octal no");
		int n=sc.nextInt();
		
		int octal2dec=oct2Dec(n);
		String decimal2bin=dec2Bin(octal2dec);
		System.out.println(octal2dec);
		
		System.out.println("octal to binary conversion of: "+n+" is "+decimal2bin);
	}

}
