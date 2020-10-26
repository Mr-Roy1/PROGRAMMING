package org.Conversion;

import java.util.Scanner;

public class Hex2Dec {
	
	static int hex2Dec(String hex) {
		int dec=0;
		int p=1;
		char ch[]=hex.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			if(ch[i]>='0' && ch[i]<='9') {
				dec=dec+(ch[i]-48)*p;
			     p=p*16;
			}
			else if (ch[i]>='A' && ch[i]<='F'){
				dec=dec+(ch[i]-55)*p;
				p=p*16;
			}
		}
		return dec;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hexadecimal no.");
		String st=sc.nextLine();
		
		int Hexadecimal2Dec=hex2Dec(st);
		System.out.println("hexadecimal todecimal conversion of :"+st+" is "+Hexadecimal2Dec);
	}
}
