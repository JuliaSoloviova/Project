package hwTask5;

import java.util.Scanner;

public class Hw4Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter");
		int a = sc.nextInt();
		String b = "";
		for (int i =1;i<=a*2-1;i++ ) {
			if (i<=a) {
			b+="*";
			} else { 
				b=b.substring(0,b.length()-1);
			}
			System.out.println(b);
		}
sc.close();
	}

}
