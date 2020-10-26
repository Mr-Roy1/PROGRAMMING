package org.String;
/* WAJPT COUNT AND PRINT HOW MANY VOWEL AND CONSONENETS PRESENT IN THE SENTENCES*/
import java.util.Scanner;

public class String_4_Count_Vowel$Consonant {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the senterces...");
        String st=sc.nextLine();
        
        char ch[]=st.toCharArray();
        int vc=0,cc=0;
        for(int i=0;i<ch.length;i++) {
        	if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
        		vc++;
        	else if(ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z')
        		cc++;
        	
        }
        System.out.println("Number of vowel: "+vc);
        System.out.println("Number of consonenet: "+cc);
	}
}
