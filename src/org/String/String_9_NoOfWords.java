package org.String;
/* WAJPT COUNT NO. OF WORDS IN THE SENTENCES*/
import java.util.Scanner;

public class String_9_NoOfWords {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the sentences...");
      String st=sc.nextLine();
      
      int words=0;
      char ch[]=st.toCharArray();
      for(int i=0;i<ch.length;i++) {
    	  if(i==0&&ch[0]!=' '||ch[i]!=' '&&ch[i-1]==' ')
    		  words++;
      }
      System.out.println("no. of words: "+words);
	}
}


