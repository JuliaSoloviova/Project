package task2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number");
		int number = sc.nextInt();
		if (number >=1 && number <= 144) {
		int entrance = (number-1)/36+1;
		int floor = (number-1)%36/4+1;
		System.out.println("The appartament is on " + entrance + " entrance and " + floor+ " floor" );
		}
		else System.out.println("Wrong number");
		sc.close();
		}

}