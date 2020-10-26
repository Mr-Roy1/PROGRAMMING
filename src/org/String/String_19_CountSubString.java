package org.String;
/*WAJPT count sub string in the user input sentence*/

import java.util.Scanner;
public class String_19_CountSubString {
	static int checkSubString(String x,String y) {
		char ch1[]=x.toCharArray();
		char ch2[]=y.toCharArray();
		int count=0;
		for(int i=0;i<ch1.length;i++) {
			int j=0;
			int k=i;
			while(j<ch2.length && k<ch1.length &&ch2[j]==ch1[k]) {
				j++;
			    k++;
			}
			if(j==ch2.length) {
				count++;
				i=k-1;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence...");
		String st1=sc.nextLine();
		System.out.println("Enter the sub String to count no. of this sub string...");
		String st2=sc.next();
		
		int pk=checkSubString(st1,st2);
		
		System.out.println("the sub string "+st2+" is present "+pk+" times(s)");
	}
}
