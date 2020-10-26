package org.String;
/*WAJPT COUNT HOW MANY CAPITAL LETTERS AND SMALL LETTERS PRESENT IN THE String*/
import java.util.Scanner;

public class String_2_Count_Capital$Small {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String st=sc.nextLine();
        
        int cl=0,sl=0;
        for(int i=0;i<st.length();i++) {
        	char ch=st.charAt(i);
        	 
        	if(ch>='A'&&ch<='Z')
        	      cl++;
        	
        	else if (ch>='a'&&ch<='z')
        	      sl++;
        	
//        	
//        	if(ch>=65&&ch<=90)
//        		cl++;
//        	else if(ch>=97&&ch<=122)
//        		sl++;
        	
        	
        	
        	/* int cl=0,sl=0;
        	 * char ch[]=st.toCharArray();
        	 * for(int i=0;i<ch.length;i++){
        	 * if(ch[i]>='A'&&ch[i]<='Z')
        	 *        cl++;
        	 * else if(ch[i]>='a'&&ch[i]<='z')
        	 *          sl++;
        	 *  }
        	 *  */
        		
        }
        System.out.println("Number of capital letters "+cl);
        System.out.println("Number of small letters "+sl);
        
	}
}
