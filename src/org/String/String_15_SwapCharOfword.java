package org.String;
/*...WAJPT swap every word first character with the same word last character... */
import java.util.*;
public class String_15_SwapCharOfword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence...");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		int f=0;
		int l=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ') {
				f=i;
			}
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				l=i;
				
				char temp=ch[f];
				ch[f]=ch[l];
				ch[l]=temp;
			}
		}
		st=new String(ch);
		System.out.println(st);
	}
}
