package org.String;
/*WAJPT reverse words in the sentence*/
import java.util.*;
public class String_16_ReverseWord {


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the binary no...");
        String st=sc.nextLine();
        
        char ch[]=st.toCharArray();
		String rw="";
		for(int i=0;i<ch.length;i++) {
			int f=i;
			  while(i<ch.length && ch[i]!=' ') {
				  i++;
			  }
			  int l=i-1;
			    while(l>=f) {
			    	rw=rw+ch[l];
			    	l--;
			    }
			    if(i<ch.length)
			    	rw=rw+" ";
		}
		System.out.println(rw);
	}
}
