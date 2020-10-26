package org.Conversion;

import java.util.Scanner;

public class Hex2Oct {
	
	static int hexDec(String hex) {
		int dec=0;
		int p=1;
		
		char ch[]=hex.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if( ch[i]>='0' && ch[i]<='9') {
				dec=dec+(ch[i]-48)*p;
				p=p*16;
			}
			else if(ch[i]>='A' && ch[i]<='F') {
				dec=dec+(ch[i]-55)*p;
				p=p*16;
			}
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
		System.out.println("Enter hexadecimal no.");
		String st=sc.next();
		
		int hexa2Decimal=hexDec(st);
		String decimal2Oct=dec2Oct(hexa2Decimal);
		System.out.println(hexa2Decimal);
		
		System.out.println("hexadecimal to octal conversion of: "+st+" is "+decimal2Oct);
	}

}
