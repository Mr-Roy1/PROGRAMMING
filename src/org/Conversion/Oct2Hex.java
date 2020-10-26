package org.Conversion;

import java.util.Scanner;

public class Oct2Hex {
	
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
		System.out.println("Enter the octal no");
		int n=sc.nextInt();
		
		int octal2dec=oct2Dec(n);
		String decimal2hex=dec2Hex(octal2dec);
		
		System.out.println("octal to decimal convesion of: "+n+" is "+decimal2hex);
				
	}

}
