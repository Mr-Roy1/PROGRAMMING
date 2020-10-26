package org.String;
/*...WAJPT CHECK USER ENTERD STRING IS PALINDROME OR NOT...*/
import java.util.Scanner;

public class String_14_Palindrome {
	static boolean isPalindrome(String st) {
		st=st.toLowerCase();
		char ch[]=st.toCharArray();
		
		int f=0,l=ch.length-1;
		while(f<l) {
			if(ch[f]!=ch[l])
				return false;
			f++;
			l--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences...");
        String st=sc.nextLine();
        
        boolean rs=isPalindrome(st);
        		if(rs==true)
        			System.out.println("String is PAlindrome ");
        		else
        			System.out.println("String is not palindrome");
	}
}


