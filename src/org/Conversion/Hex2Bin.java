package org.Conversion;

import java.util.Scanner;

public class Hex2Bin {
	
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
	static String dectoBin(int dec) {
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
		System.out.println("Enter hexadecimal no.");
		String st=sc.next();
		
		int hexa2Decimal=hexDec(st);
		String decimal2Bin=dectoBin(hexa2Decimal);
		
		System.out.println("hexadecimal to binary conversion of: "+st+" is "+decimal2Bin);
		
	}
}
