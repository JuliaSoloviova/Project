package hwTask4;
import java.util.Scanner;
public class Hw4Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		for (int i = 1; i<=a; i++) {
			for (int j = 1; j<=b; j++) {
				if ((i==1)||(j==b) || (i==a) || (j==1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
		

	}

}
