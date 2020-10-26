package org.String;
/*WAJPT CALCULATE THE SUM OF DIGITS IN THE STRING*/

import java.util.Scanner;

public class String_5_SumOfDigits {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the sentences...");
        String st=sc.nextLine();
        int sum=0;
        for(int i=0;i<st.length();i++) {
        	char ch=st.charAt(i);
        	if(ch>=48&&ch<=57)
        		sum=sum+ch-48;     // ASCII VALUE OF (0 TO 9) IS (48 TO 57) //
        }
        
/*        char ch[]=st.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]>='0'&&ch[i]<='9') {
        		int b=Integer.parseInt(String.valueOf(ch[i]));
        		sum=sum+b;
        	}
        }*/
        System.out.println("Sum of digits: "+sum);
	}

}
