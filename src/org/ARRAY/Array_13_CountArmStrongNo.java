package org.ARRAY;
/* WAJPT count how many armstrong no present in the array*/
import java.util.Scanner;

public class Array_13_CountArmStrongNo {
	static boolean isArmStrong(int x) {
		int t=x;
		int sum=0;
		while(x!=0) {
			int r=x%10;
			     sum=sum+r*r*r;
			   x=x/10;  
		}
		if(sum==t)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of size: ");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("Enter "+n+" Elements..." );
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<ar.length;i++) {
			boolean pp=isArmStrong(ar[i]);
			if(pp==true)
				count++;
		}
		System.out.print("Number of armStrong no is: "+count);
	}

}
