package task7;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		int a = number/1000;
		int b = number%1000/100;
		int c = number%100/10;
		int d = number%10;
		
		if ((a+b)==(c+d)) {
			System.out.println("Lucky");
		} else System.out.println("not today, bro");
		sc.close();
	}

}
