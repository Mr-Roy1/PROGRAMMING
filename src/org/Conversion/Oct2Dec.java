package org.Conversion;

import java.util.Scanner;

public class Oct2Dec {
	
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
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the binary no");
		int n=sc.nextInt();
		
		int octal2Dec=oct2Dec(n);
		System.out.println("octal to decimal conversion of: "+n+" is "+octal2Dec);
		
	}

}
