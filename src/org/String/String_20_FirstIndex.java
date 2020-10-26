package org.String;

import java.util.Scanner;

public class String_20_FirstIndex {
	static int firstIndexOf(String x,String y) {
		char ch1[]=x.toCharArray();
		char ch2[]=y.toCharArray();
		
		for(int i=0;i<ch1.length;i++) {
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length && ch1[k]==ch2[j]) {
				j++;
				k++;
			}
			if(j==ch2.length)
				return i;
		}
		return-1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentences");
		String st1=sc.nextLine();
		System.out.println("Enter other sentences");
		String st2=sc.nextLine();
		
		int pp=firstIndexOf(st1,st2);
		System.out.println(pp);

	}

}
