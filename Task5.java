package task5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double r = 4;
		double x;
		double y;
		System.out.println("Input coordinates x");
		x = sc.nextDouble();
		System.out.println("Input coordinates y");
		y = sc.nextDouble();
		r = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
		if (r <=4) {
			System.out.println("Popal");
		} else {
			System.out.println("Ne popal");
		}
		sc.close();
	}

}
