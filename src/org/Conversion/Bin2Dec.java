*package org.Conversion;

import java.util.Scanner;

public class Bin2Dec {
	
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
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the binary no.");
		int n=sc.nextInt();
		
		int decimal=bin2Dec(n);
		System.out.println("binary to decimal conversion of: "+n+" is "+decimal);
		
	}

}
