package org.String;
/*WAJPT READ THE STRING FROM THE USER AND PRINT THE INDEX AND CORRESPONDING CHARACTER*/
import java.util.Scanner;

public class String_1_index$Char {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the Sentences...");
		String st=sc.nextLine();// Ram is a Programmer
		
		for(int i=0;i<st.length();i++) {
			System.out.println(i+"------>"+st.charAt(i));
		}
		System.out.println("--------------------------------------------");
		
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) {
			System.out.println(i+"------>"+ch[i]);
		}
		sc.close();
	}
}


