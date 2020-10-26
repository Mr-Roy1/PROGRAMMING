package org.String;
/*...WAJPT CHECK USER ENTERED STRING IS PANAGRAM OR NOT...
 * PANAGRAM:-- A PANAGRAM is a sentence or expression that uses all the letters of the alphabet*/

import java.util.Scanner;

public class String_12_Pangram {
	static boolean isPanagrma(String st) {
		if(st.length()<26)
			return false;
		int count[]=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
			count[ch-97]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences...");
        String st=sc.nextLine();
        
        boolean rs=isPanagrma(st);
        if(rs==true)
        	System.out.println("String is a panagram");
        else
        	System.out.println("String is not a panagram");
	}
}
