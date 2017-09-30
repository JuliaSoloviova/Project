package hwTask7;

import java.util.Scanner;

public class Hw4Task7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter odd number");
		int a = sc.nextInt();
		while(a%2==0) {
			System.out.println("Wrong number. Enter ODD number");
			a = sc.nextInt();}
		for (int i=1; i<=a; i++) {
			for (int j=1; j<=a; j++) {
				if (((j>=i)&&(i+j<=a+1)) || ((j<=i)&&(j+i>a))){
					System.out.print("*");
				} else {System.out.print(" ");}
			}
		System.out.println();	
		}
		sc.close();
	}
		
}
