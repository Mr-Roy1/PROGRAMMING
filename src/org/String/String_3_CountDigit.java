package org.String;
/* WAJPT  take input from the user and print the no. of digit present in the string */
import java.util.Scanner;

public class String_3_CountDigit {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentences...");
        String st=sc.nextLine();
        
        char ch[]=st.toCharArray();
        int dc=0;
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='0'&&ch[i]<='9')
        		dc++;
        }
        System.out.println("Number of digits is "+dc);
	}
}
