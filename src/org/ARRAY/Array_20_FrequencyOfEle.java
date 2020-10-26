package org.ARRAY;
//WAJP to print the frequency of each element...
import java.util.Scanner;

public class Array_20_FrequencyOfEle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int n1=ar.length;
		for(int i=0;i<n1;i++) {
			int count=1;
			for(int j=i+1;j<n1;j++) {
				if(ar[i]==ar[j]) {
					count++;
					ar[j]=ar[n1-1];
					n1--;
					j--;
				}
			}
			System.out.println(ar[i]+"--->"+count);
		}
	}
}
