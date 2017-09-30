package hwTask2;

import java.util.Scanner;

public class Hw4Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = sc.nextInt();
		int b =1;
		if (a<0) {
			System.out.println("Enter new number");
			a = sc.nextInt();
		}
		
		for (int i =1; i<=a ;i+=1) {
			b*=i;
		}
		System.out.println(b);
		sc.close();
	}
	

}
