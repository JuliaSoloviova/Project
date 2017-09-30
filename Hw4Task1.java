package homeWork4;

import java.util.Scanner;

public class Hw4Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1");
		int a = sc.nextInt();
		
		for (int i = 0; i < 5 ; i+=1) {
			for (int j = 0; j <a; j+=1) {
				if (j%2 == 0) {
					System.out.print("***");
				} else {
					System.out.print("+++");
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
