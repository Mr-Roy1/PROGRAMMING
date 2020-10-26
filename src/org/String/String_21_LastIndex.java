package org.String;

import java.util.Scanner;

public class String_21_LastIndex {
	static int lastIndexOf(String x,String y) {
		char ch1[]=x.toCharArray();
		char ch2[]=y.toCharArray();
		int index=-1;
		for(int i=0;i<ch1.length;i++) {
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length && ch1[k]==ch2[j]) {
				j++;
				k++;
			}
			if(j==ch2.length) {
				index=i;
				i=k-1;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the sentences");
		String st1=sc.nextLine();
		System.out.println("Enter other sentences");
		String st2=sc.nextLine();
		
		int pp=lastIndexOf(st1,st2);
		System.out.println(pp);
	}
}
