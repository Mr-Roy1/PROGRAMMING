package org.String;
/* WAJPT COUNT HOW MANY WORDS PRESENT IN THE STRING*/
import java.util.Scanner;
import java.util.StringTokenizer;

public class String_8_CountWords {
	static int countWords(String inp) {
		if(inp==null||inp.isEmpty())
			return 0;
		StringTokenizer tokencount=new StringTokenizer(inp);
		return tokencount.countTokens();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentences...");
        String st=sc.nextLine();
        
        int wcount=countWords(st);
        System.out.println("no. of words present in the given String: "+wcount);
	}
}
