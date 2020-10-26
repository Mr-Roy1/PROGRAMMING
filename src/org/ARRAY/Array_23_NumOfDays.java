package org.ARRAY;
import java.util.Scanner;
	public class Array_23_NumOfDays {

		int dd, mm, yy;
		int[] month = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		Array_23_NumOfDays(int dd, int mm, int yy) {
			this.dd = dd;
			this.mm = mm;
			this.yy = yy;

			if (yy % 400 == 0 || yy % 4 == 0 && yy % 100 != 0) {
				month[2] = 29;
			}
		}

		public int numberOfDay() {

			int days = 0;
			int y = yy - 1;

			days = days + y * 365;
			days = days + y / 400 + y / 4 - y / 100;

			for (int i = 0; i < mm; i++) {
				days = days + month[i];
			}
			days = days + dd;

			return days;
		}

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the First Date");
			int d1 = sc.nextInt();
			int m1 = sc.nextInt();
			int y1 = sc.nextInt();

			Array_23_NumOfDays nd1 = new Array_23_NumOfDays(d1, m1, y1);
			System.out.println("Number of days:" + nd1.numberOfDay());

			System.out.println("Enter the Seceond Date");
			int d2 = sc.nextInt();
			int m2 = sc.nextInt();
			int y2 = sc.nextInt();

			Array_23_NumOfDays nd2 = new Array_23_NumOfDays(d2, m2, y2);
			System.out.println("Number of days:" + nd2.numberOfDay());

			int x = nd1.numberOfDay();
			int y = nd2.numberOfDay();

			System.out.println("Number of Days between Two Dates:" + (y - x));
			sc.close();

		}
	}



