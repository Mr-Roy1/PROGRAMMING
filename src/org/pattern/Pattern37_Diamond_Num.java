package org.pattern;

import java.util.Scanner;

public class Pattern37_Diamond_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of lines");
		int n=sc.nextInt();
		int sp=n/2,ele=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++) {
				System.out.print("  ");
			}
			int k=sp+1;
			for(int j=1;j<=ele;j++){
					System.out.print(k+" ");
		}
		   if(i<=n/2) {
			   sp--;
			   ele=ele+2;
		   }
		   else {
			   sp++;
			   ele=ele-2;
		   }
		   System.out.println();

	}

}
}
