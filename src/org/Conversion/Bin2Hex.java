package org.Conversion;

import java.util.Scanner;

public class Bin2Hex {
	
	static int bin2Dec(int bin) {
		int dec=0;
		int p=1;
		while(bin!=0) {
			int r=bin%10;
			dec=dec+r*p;
			p=p*2;
			bin=bin/10;
		}
		return dec;
	}
	static String dec2hex(int dec) {
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
		System.out.println("Enter the binary no");
		int n=sc.nextInt();
		
		int binary2dec=bin2Dec(n);
		String decimal2Hex=dec2hex(binary2dec);
		
		System.out.println("binary to hexadecimal conversion of: "+n+" is "+decimal2Hex);
		

	}

}
