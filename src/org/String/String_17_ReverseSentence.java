package org.String;
/*WAJPT reverse the sentences...*/
import java.util.Scanner;

public class String_17_ReverseSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Sentence...");
		String st=sc.nextLine();
		
		char ch[]=st.toCharArray();
		String reverse="";
		for(int i=ch.length-1;i>=0;i--) {
			int l=i;						// HERE 'L' MEANS LAST  //
			while(i>=0 && ch[i]!=' ') {
				i--;
			}
			int f=i+1;						// HERE 'F' MEANS FIRST //
			while(l>=f) {
				reverse=reverse+ch[f];
				f++;
			}
			if(i>0) {
				reverse=reverse+" ";
			}
		}
		System.out.println(reverse);
	}

}
