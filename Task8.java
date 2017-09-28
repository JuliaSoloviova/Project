package task8;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int number = sc.nextInt();
		
		int a = number/100000;
		int b = number%100000/10000;
		int c = number%10000/1000;
		int d = number%1000/100;
		int e = number%100/10;
		int f = number%10;
		
		if ((a==f) && (b==e) && (c==d)) {
			System.out.println("Das Polyndromium >:)");
		} else System.out.println("Nicht");
		sc.close();
			
	}

}
