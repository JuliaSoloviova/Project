package task3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();
		if (year%4==0) {
			if (year%100==0) {
			
				if (year%400==0) {
					System.out.println("Number of days in year is 366");
				} else System.out.println("Number of days in year is 365");
			} else System.out.println("Number of days in year is 366");
		} else {
			System.out.println("Number of days in year is 365");
		} sc.close();

	}

}
