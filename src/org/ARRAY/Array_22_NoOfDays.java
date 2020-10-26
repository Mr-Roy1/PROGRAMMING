package org.ARRAY;
/*...WAJPT PRINT NUMBER OF DAYS BETWEEN TWO DATES...*/
import java.util.Scanner;

public class Array_22_NoOfDays {
	int dd,mm,yy;
	int[] month= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	
	Array_22_NoOfDays(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0) {
			month[2]=29;
		}
	}
	
	 int numberOfDays() {
			int days=0;
			int y=yy-1;
			
			days=days+y*365;
			days=days+y/400+y/4-y/100;
			
			for(int i=1;i<mm;i++) {
				days=days+month[i];
			}
			days=days+dd;
			return days;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st dates");
        int d1=sc.nextInt();
        int m1=sc.nextInt();
        int y1=sc.nextInt();
        
        Array_22_NoOfDays nd1=new Array_22_NoOfDays(d1,m1,y1);
        System.out.println("Number of days: "+nd1.numberOfDays());
        
        System.out.println("Enter the 2nd date");
        int d2=sc.nextInt();
        int m2=sc.nextInt();
        int y2=sc.nextInt();
        
        Array_22_NoOfDays nd2 =new Array_22_NoOfDays(d2,m2,y2);
        System.out.println("Number of days: "+nd2.numberOfDays());
        
        int x=nd1.numberOfDays();
        int y=nd2.numberOfDays();
        
        System.out.println("no of days between two dates: "+(y-x));
	}

}
