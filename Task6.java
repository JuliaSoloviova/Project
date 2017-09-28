package task6;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		double x = sc.nextDouble();
		
		System.out.println("Enter y");
		double y = sc.nextDouble();
		
		if((x>=y) && (x<=6*y) && (y+1.5*x<=10)) {
			System.out.println("Inside");
			} else System.out.println("Outside");
		
		sc.close();

	}

}
