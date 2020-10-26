package org.String;
/*WAJPT COUNT HOW MANY VOWELS,CONSONENET,CAPITAL LETTRS,SMALL LETTERS,DIGITS,AND SPECIAL CHARACTERS 
 * PRESENTS IN THE STRING*/
import java.util.Scanner;

public class String_7_count_vCclSL {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences...");
        String st=sc.nextLine();
        
        int vc=0,cc=0,uc=0,lc=0,spc=0,dc=0;
        
        for(int i=0;i<st.length();i++) {
        	char ch=st.charAt(i);
        	if(ch>='A'&&ch<='Z') {
        		uc++;
        	if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        	          vc++;
        	      else
        	    	  cc++;
        }
        	else if(ch>='a'&&ch<='z') {
        		 lc++;
        	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        		 vc++;
        	else
        		 cc++;
        }
        	else if(ch>='0'&&ch<='9') {
        		dc++;
        	}
        	else {
        		spc++;
        	}
        }
        System.out.println("no.of capital letter is: "+uc);
        System.out.println("no.of vowel is: "+vc);
        System.out.println("no.of consonenet is: "+cc);
        System.out.println("no.of small lettre is: "+lc);
        System.out.println("no.of digit is: "+dc);
        System.out.println("no.of special character is: "+spc);
	}
}
