package org.String;
/*...WAJPT CHECK USER ENTERED TWO STRING ARE ANAGRAM OR NOT...
 * 
 * DEF.==WHAT ARE THE CHARACTER PRESENT IN THE FIRST STIRNG ALL THE CHARACTER MUST BE PRESENT IN 
 * THE SECOND STRING*/

import java.util.Scanner;

public class String_13_Anagram {
	static boolean isAnagram(String st1,String st2) {
		int c1[]=new int[26];
		for(int i=0;i<st1.length();i++) {
			char ch=st1.charAt(i);
			if(ch>='A'&&ch<='Z')
				c1[ch-65]++;
			else if(ch>='a'&&ch<='z')
				c1[ch-97]++;
		}
		int c2[]=new int[26];
		for(int i=0;i<st2.length();i++) {
			char ch=st2.charAt(i);
			if(ch>='A'&&ch<='Z')
				c2[ch-65]++;
			else if(ch>='a'&&ch<='z')
				c2[ch-97]++;
				
		}
		for(int i=0;i<c1.length;i++) {
			if(c1[i]!=c2[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 1st sentences...");
        String st1=sc.nextLine();
        System.out.println("Enter the 1st sentences...");
        String st2=sc.nextLine();
        
        boolean rs=isAnagram(st1,st2);
        if(rs==true)
        	System.out.println("String are anagram");
        else
        	System.out.println("String are not anagram");
	}
}
