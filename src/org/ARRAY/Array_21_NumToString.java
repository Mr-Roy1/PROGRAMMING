package org.ARRAY;
/*...WAJPT CONVERT NUMBER TO STRING...*/
import java.util.Scanner;

public class Array_21_NumToString {
	
	static void numToString(int n,String st) {
		String one[]= {" ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
				"Eleven","Tweleve","Thirteen","Fourteen","Fiftheen","Sixteen","Seventeen","Eighteen",
				"Ninteen"};
		
		String two[]= {" "," ","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
				
		if(n<20)
			System.out.print(one[n]);
		else
			System.out.print(two[n/10]+one[n%10]);
		
		if(n!=0)
			System.out.print(st+" ");
	}
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        
        numToString(n/10000000,"Crore");
        numToString(n/100000%100,"Lakh");
        numToString(n/1000%100,"Thousand");
        numToString(n/100%10,"Hundred");
        numToString(n%100," ");
        
	} 

}
