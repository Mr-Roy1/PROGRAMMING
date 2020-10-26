package org.String;
/*WAJPT search sub string in given sentences...*/

import java.util.Scanner;
 
public class String_18_SearchSubString {
	static	boolean  checkSubString(String x,String y) {
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
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence...");
		String st1=sc.nextLine();
		System.out.println("Enter a string to check whether it is a sub string or not...");
		String st2=sc.nextLine();
		
		boolean rs=checkSubString(st1,st2);
		if(rs==true) {
			System.out.println(st2 +" is a sub string of "+st1);
		}
		else {
			System.err.println(st2 +" is not a sub string of "+st1);
		}
	}
}
