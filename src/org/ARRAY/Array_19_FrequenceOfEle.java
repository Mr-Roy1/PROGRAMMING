package org.ARRAY;
//WAJP to print the frequency of each Element
import java.util.Scanner;

public class Array_19_FrequenceOfEle {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
         for(int i=0;i<ar.length;i++) {
        	 if(ar[i]>=0) {
	            int count=1;
	            for(int j=i+1;j<ar.length;j++) {
	            	
	            	if(ar[i]==ar[j]) {
	            		count++;
	            		ar[j]=-1;
	            }
	            }
	            System.out.println(ar[i]+"----->"+count);
          }
	}
}
}
